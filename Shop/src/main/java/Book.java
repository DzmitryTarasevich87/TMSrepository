import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(propOrder = {"articleNumber", "name", "yearOfPublication","serialBooks"}, name = "book")
public class Book {
    @JsonProperty("article")
    private int articleNumber;
    @JsonProperty("name")
    private String name;
    @JsonProperty("year")
    private int yearOfPublication;
    @JsonProperty("serial")
    private List<Book> serialBooks;

    public Book() {
    }

    public Book(int articleNumber, String name, int yearOfPublication, List<Book> serialBooks) {
        this.articleNumber = articleNumber;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.serialBooks = serialBooks;
    }

    public List<Book> getSerialBooks() {
        return serialBooks;
    }

    public void setSerialBooks(List<Book> serialBooks) {
        this.serialBooks = serialBooks;
    }

    public int getArticleNumber() {
        return this.articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "articleNumber=" + articleNumber +
                ", name='" + name + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", serialBooks=" + serialBooks +
                '}';
    }
}
