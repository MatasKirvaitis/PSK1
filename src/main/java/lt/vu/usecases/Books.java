package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Author;
import lt.vu.entities.Book;
import lt.vu.interceptors.LoggedInvocation;
import lt.vu.persistence.AuthorsDAO;
import lt.vu.persistence.BooksDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Model
@RequestScoped
public class Books implements Serializable {

    @Inject
    private AuthorsDAO authorsDAO;

    @Inject
    private BooksDAO booksDAO;

    @Getter @Setter
    private Author author = new Author();

    @Getter @Setter
    private Book bookToCreate = new Book();

    @Getter
    private List<Book> bookList;

    @PostConstruct
    public void init(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer authorId = Integer.parseInt(requestParameters.get("authorId"));
        this.author = authorsDAO.findOne(authorId);
        loadAuthorsBooks(authorId);
    }

    private void loadAuthorsBooks(Integer authorId) { bookList = booksDAO.loadAll(authorId); }

    @Transactional
    public String createBook(){
        bookToCreate.setAuthor(this.author);
        booksDAO.persist(bookToCreate);
        return "authorsBooks?faces-redirect=true&authorId=" + this.author.getId();
    }
}
