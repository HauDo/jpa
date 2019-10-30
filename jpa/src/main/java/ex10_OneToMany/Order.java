package ex10_OneToMany;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "T_order")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "order_orderline",
//            joinColumns = @JoinColumn(name = "order_fk"),
//            inverseJoinColumns = @JoinColumn(name = "orderline_fk"))
    private Set<OrderLine> orderLines;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
