package ex14_Inheritance_JoinedSubClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main14 {
    public static void main(String[] args) {
        Item14 item = new Item14();
        item.setTitle("Nothing to do");

        Book14 book = new Book14();
        book.setAuthor("Mr.Book");

        CD14 cd = new CD14();
        cd.setArtist("Mr.CD");

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(cd);
        entityManager.persist(item);
        entityManager.persist(book);

        transaction.commit();

        List<Item14> item14 = entityManager.createNamedQuery(Item14.GET_ALL_ITEM, Item14.class).getResultList();

        System.out.println(item14.size());

        entityManager.close();
        managerFactory.close();
    }
}
