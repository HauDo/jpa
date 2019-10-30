package ex15_Inheritance_TablePerConcreteClass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
        @NamedQuery(name = Item15.GET_ALL_ITEM, query = "SELECT i FROM Item15 i")
})
public class Item15 {
    public static final String GET_ALL_ITEM = "GetAllItem15";

    @Id
    @GeneratedValue
    protected Long id;
    protected String title;

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
}
