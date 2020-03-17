package ac.elevation.spotchecks.oop2.spotcheck2;

import java.util.Objects;

/**
 * @author Yogev Lidor
 * @date 17/03/2020
 */
public class Author {

    private String name;
    private String email;
    private int age;

    public Author(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author book = (Author) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(email, book.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
