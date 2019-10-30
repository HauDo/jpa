package ex15_Inheritance_TablePerConcreteClass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@AttributeOverrides({
        @AttributeOverride(name = "title", column = @Column(name = "cd15_title"))
})
public class CD15 extends Item15 {
    @NotNull
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}
