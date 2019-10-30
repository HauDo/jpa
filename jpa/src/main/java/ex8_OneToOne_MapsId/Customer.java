package ex8_OneToOne_MapsId;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = Customer.GET_ALL, query = "SELECT c FROM Customer c")
})
public class Customer {
    public static final String GET_ALL = "GetAllCustomer";

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    @MapsId
    private Address address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
