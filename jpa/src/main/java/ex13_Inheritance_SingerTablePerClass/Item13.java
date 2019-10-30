package ex13_Inheritance_SingerTablePerClass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQueries({
        @NamedQuery(name = Item13.GET_ALL_ITEM, query = "SELECT i FROM Item13 i")
})
public class Item13 {
    public static final String GET_ALL_ITEM = "GetAllItem13";
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
