package ex8_OneToOne_MapsId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("CT");

        Customer customer = new Customer();
        customer.setName("A");
        customer.setAddress(address);

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(customer);

        transaction.commit();

        List<Customer> book6s = entityManager.createNamedQuery(Customer.GET_ALL, Customer.class).getResultList();
        System.out.println(book6s.size());

        entityManager.close();
        managerFactory.close();
    }
}
