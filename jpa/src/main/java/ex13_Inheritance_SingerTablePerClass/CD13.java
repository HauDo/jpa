package ex13_Inheritance_SingerTablePerClass;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class CD13 extends Item13 {
    @NotNull
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
