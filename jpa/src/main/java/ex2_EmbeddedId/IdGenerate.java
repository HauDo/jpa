package ex2_EmbeddedId;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class IdGenerate implements Serializable {
    private String language;
    private String title;

    public IdGenerate() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
