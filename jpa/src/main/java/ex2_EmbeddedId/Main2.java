package ex2_EmbeddedId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main2 {
    public static void main(String[] args) {
        IdGenerate idGenerate = new IdGenerate();
        idGenerate.setTitle("Book13-A");
        idGenerate.setLanguage("Vi");

        Book2 book = new Book2();
        book.setDescription("Hello everybody, I'm a book");
        book.setId(idGenerate);

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
