package ex14_Inheritance_JoinedSubClass;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class CD14 extends Item14 {
    @NotNull
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
