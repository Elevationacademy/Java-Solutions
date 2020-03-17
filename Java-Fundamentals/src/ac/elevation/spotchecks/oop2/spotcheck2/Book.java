package ac.elevation.spotchecks.oop2.spotcheck2;

import java.util.Objects;

/**
 * @author Yogev Lidor
 * @date 17/03/2020
 */
public class Book {

    private String name;
    private Author author;
    private int price;

    public Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, author);
    }
}
