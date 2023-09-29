package mvc.entity;

import mvc.entity.BookEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookdetails")
public class BookDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "price")
    private int price;

    @Column(name = "numberOfPage")
    private int NumberOfPage;

    @Column(name = "publishDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publishDate;

    @OneToOne(mappedBy = "bookDetails")
    private BookEntity book;

    public BookDetailsEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfPage() {
        return NumberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        NumberOfPage = numberOfPage;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }
}