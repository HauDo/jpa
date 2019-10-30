package ex2_EmbeddedId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Book2 {

    @EmbeddedId
    private IdGenerate id;

    @Size(min = 10, max = 2000)
    private String description;

    private Float price;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;

    public IdGenerate getId() {
        return id;
    }

    public void setId(IdGenerate id) {
        this.id = id;
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
