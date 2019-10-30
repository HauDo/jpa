package ex9_OneToOne_JoinColumn;


import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = Customer2.GET_ALL, query = "SELECT c FROM Customer2 c")
})
public class Customer2 {
    public static final String GET_ALL = "GetAllCustomer2";

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "address_fk")
    private Address2 address;


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

    public Address2 getAddress() {
        return address;
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }
}
