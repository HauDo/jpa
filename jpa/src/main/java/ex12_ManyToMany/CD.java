package ex12_ManyToMany;

import javax.persistence.*;
import java.util.List;

@Entity
public class CD {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @ManyToMany(mappedBy = "appearsOnCDs", cascade = CascadeType.ALL)
    private List<Artist> createdByArtists;

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

    public List<Artist> getCreatedByArtists() {
        return createdByArtists;
    }

    public void setCreatedByArtists(List<Artist> createdByArtists) {
        this.createdByArtists = createdByArtists;
    }
}
