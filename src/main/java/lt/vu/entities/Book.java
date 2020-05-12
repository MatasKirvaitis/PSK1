package lt.vu.entities;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book as b WHERE b.author.id =: authorId")
})
@Table(name = "BOOK")
@Getter
@Setter
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    @NotNull
    private String isbn;

    @ManyToOne
    private Author author;

    @ManyToMany
    @JoinTable(name = "BOOK_GENRES")
    private List<Genre> genres = new ArrayList<>();

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer version;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book books = (Book) o;
        return Objects.equals(title, books.title) &&
                isbn.equals(books.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, isbn);
    }
}
