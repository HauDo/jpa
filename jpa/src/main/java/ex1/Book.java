package ex1;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name = Book.FIND_ALL_BOOK, query = "SELECT p FROM Book13 p"),
        @NamedQuery(name = Book.FIND_BOOK_H2G2, query = "SELECT p FROM Book13 p WHERE p.title='H2G2'"),
})
public class Book {

    public static final String FIND_ALL_BOOK = "findAddBook";
    public static final String FIND_BOOK_H2G2 = "findBookH2G2";

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String title;

    @Size(min = 10, max = 2000)
    private String description;

    private Float price;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }
}
