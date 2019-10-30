package ex1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("1122");
        book.setDescription("Hello everybody, I'm a book");

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(book);
        transaction.commit();

        Book book1 = (Book) entityManager.createNamedQuery(Book.FIND_BOOK_H2G2).getSingleResult();
        System.out.println(book1.getTitle());

        entityManager.close();
        managerFactory.close();
    }
}
