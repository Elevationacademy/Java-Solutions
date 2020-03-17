package ac.elevation.spotchecks.oop2.spotcheck2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Yogev Lidor
 * @date 17/03/2020
 */
public class RareBooks {

    private Set<Book> booksCollection;

    public RareBooks() {
        booksCollection = new HashSet<>();
    }

    /**
     * @param book
     * @return true if the book added, false if already exist.
     */
    public boolean addBook(Book book) {
        return booksCollection.add(book);
    }
}
