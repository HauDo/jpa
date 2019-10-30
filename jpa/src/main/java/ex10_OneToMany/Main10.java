package ex10_OneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Main10 {
    public static void main(String[] args) {
        Order order = new Order();

        OrderLine orderLine = new OrderLine();
        orderLine.setItem("tea");

        Set<OrderLine> orderLines = new HashSet<>();
        orderLines.add(orderLine);

        order.setTitle("hi");
        order.setOrderLines(orderLines);

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(order);

        transaction.commit();

        entityManager.close();
        managerFactory.close();
    }
}
