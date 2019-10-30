package ex4_SecondaryTables;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main4 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setId(1l);
        address.setCity("Can Tho");
        address.setCountry("Viet Nam");
        address.setState("DBSCL");
        address.setStreet1("street1");
        address.setStreet2("street2");
        address.setZipcode("900000");

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(address);
        transaction.commit();

//        Address address1 = entityManager.createNamedQuery(Address.FIND_ADDRESS, Address.class).getSingleResult();
//
//        System.out.println(address1.getCity());
//        System.out.println(address1.getCountry());
//        System.out.println(address1.getState());

        entityManager.close();
        managerFactory.close();
    }
}
