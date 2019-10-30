package ex6_ElementCollection_List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        Book6 book = new Book6();
        book.setTitle("Title");

        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        tags.add("tag2");

        book.setTags(tags);

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(book);
        transaction.commit();

//        List<Book6> book6s = entityManager.createNamedQuery(Book6.GET_ALL, Book6.class).getResultList();
//        System.out.println(book6s.size());

        entityManager.close();
        managerFactory.close();
    }
}
