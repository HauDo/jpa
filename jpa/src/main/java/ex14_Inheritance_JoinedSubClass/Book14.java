package ex14_Inheritance_JoinedSubClass;

import javax.persistence.Entity;

@Entity
public class Book14 extends Item14 {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
