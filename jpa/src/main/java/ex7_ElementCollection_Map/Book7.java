package ex7_ElementCollection_Map;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@NamedQueries({
        @NamedQuery(name = Book7.GET_ALL_Book7, query = "SELECT b FROM Book7 b")
})
public class Book7 {
    public static final String GET_ALL_Book7 = "GetAllBook7";

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "TagMap")
    @MapKeyColumn(name = "tagMap")
    private Map<Integer, String> tag = new HashMap<>();

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

    public Map<Integer, String> getTracks() {
        return tag;
    }

    public void setTags(Map<Integer, String> tracks) {
        this.tag = tracks;
    }
}

