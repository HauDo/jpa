package ex9_OneToOne_JoinColumn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        Address2 address = new Address2();
        address.setCity("CT");

        Customer2 customer = new Customer2();
        customer.setName("A");
        customer.setAddress(address);

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(address);
        entityManager.persist(customer);

        transaction.commit();

        List<Customer2> book6s = entityManager.createNamedQuery(Customer2.GET_ALL, Customer2.class).getResultList();
        System.out.println(book6s.size());

        entityManager.close();
        managerFactory.close();
    }

}
