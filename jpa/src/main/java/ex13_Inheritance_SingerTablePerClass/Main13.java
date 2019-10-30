package ex13_Inheritance_SingerTablePerClass;

import ex14_Inheritance_JoinedSubClass.Item14;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main13 {
    public static void main(String[] args) {
        Item13 item = new Item13();
        item.setTitle("Nothing to do");

        Book13 book = new Book13();
        book.setAuthor("Mr.A");

        CD13 cd = new CD13();
        cd.setArtist("Mr.D");

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(cd);
        entityManager.persist(item);
        entityManager.persist(book);

        transaction.commit();

        List<Item13> item13 = entityManager.createNamedQuery(Item13.GET_ALL_ITEM, Item13.class).getResultList();

        System.out.println(item13.size());


        entityManager.close();
        managerFactory.close();
    }
}
