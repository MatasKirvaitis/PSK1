package lt.vu.entities;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Author.loadAll", query = "SELECT a FROM Author as a")
})
@Table(name = "AUTHOR")
@Getter @Setter
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    @NotNull
    private String personalCode;

    @OneToMany
    private List<Book> books = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author authors = (Author) o;
        return Objects.equals(firstName, authors.firstName) &&
                Objects.equals(lastName, authors.lastName) &&
                personalCode.equals(authors.personalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }
}
