package ex11_OneToMany_JoinColumn;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Main11 {
    public static void main(String[] args) {
        Order2 order = new Order2();

        OrderLine2 orderLine = new OrderLine2();
        orderLine.setItem("tea");

        Set<OrderLine2> orderLines = new HashSet<>();
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

