package ex14_Inheritance_JoinedSubClass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({
        @NamedQuery(name = Item14.GET_ALL_ITEM, query = "SELECT i FROM Item14 i")
})
public class Item14 {
    public static final String GET_ALL_ITEM = "GetAllItem14";

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
