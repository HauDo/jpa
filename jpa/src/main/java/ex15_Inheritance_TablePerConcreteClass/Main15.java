package ex15_Inheritance_TablePerConcreteClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main15 {
    public static void main(String[] args) {
        Item15 item = new Item15();
        item.setTitle("Nothing to do");

        Book15 book = new Book15();
        book.setAuthor("Mr.Book");

        CD15 cd = new CD15();
        cd.setArtist("Mr.CD");

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(cd);
        entityManager.persist(item);
        entityManager.persist(book);

        transaction.commit();

        List<Item15> item15 = entityManager.createNamedQuery(Item15.GET_ALL_ITEM, Item15.class).getResultList();

        System.out.println(item15.size());

        entityManager.close();
        managerFactory.close();
    }
}
