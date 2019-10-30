package ex7_ElementCollection_Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class Main7 {
    public static void main(String[] args) {
        Book7 book = new Book7();
        book.setTitle("Title");

        Map<Integer, String> tagMap = new HashMap<>();
        tagMap.put(1, "tag1");
        tagMap.put(2, "tag2");

        book.setTags(tagMap);

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(book);
        transaction.commit();

//        List<Book7> book6s = entityManager.createNamedQuery(Book7.GET_ALL, Book7.class).getResultList();
//        System.out.println(book6s.size());

        entityManager.close();
        managerFactory.close();
    }
}
