package ex13_Inheritance_SingerTablePerClass;

import javax.persistence.Entity;

@Entity
public class Book13 extends Item13 {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
