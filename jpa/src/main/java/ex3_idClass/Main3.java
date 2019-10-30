package ex3_idClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main3 {
    public static void main(String[] args) {
        Book3 book = new Book3();
        book.setLanguage("vi");
        book.setTitle("1122");
        book.setDescription("Hello everybody, I'm a book");

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(book);
        transaction.commit();

        entityManager.close();
        managerFactory.close();
    }
}
