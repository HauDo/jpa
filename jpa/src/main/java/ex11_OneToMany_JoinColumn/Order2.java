package ex11_OneToMany_JoinColumn;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Order2 {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order2_orderline2_xyz",
            joinColumns = @JoinColumn(name = "order2_fk_zyx"),
            inverseJoinColumns = @JoinColumn(name = "orderline2_fk_yzx"))
    private Set<OrderLine2> orderLines;

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

    public Set<OrderLine2> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine2> orderLines) {
        this.orderLines = orderLines;
    }
}
