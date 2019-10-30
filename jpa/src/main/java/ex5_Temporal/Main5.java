package ex5_Temporal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class Main5 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCreationDate(new Date());
        customer.setDateOfBirth(new Date());
        customer.setCurrentTime(new Date());
        customer.setFirstName("A");
        customer.setHiddenField("Testing");

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(customer);
        transaction.commit();

        Customer customer1 = (Customer) entityManager.createNamedQuery(Customer.FIND_CUSTOMER).getSingleResult();
        System.out.println(customer1.getFirstName());
        System.out.println(customer1.getCreationDate());
        System.out.println(customer1.getDateOfBirth());
        System.out.println(customer1.getCurrentTime());

        entityManager.close();
        managerFactory.close();
    }
}
