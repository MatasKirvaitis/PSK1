package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Author;
import lt.vu.persistence.AuthorsDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Model
@RequestScoped
public class Authors {

    @Inject
    private AuthorsDAO authorsDAO;

    @Getter @Setter
    private Author authorToCreate = new Author();

    @Getter
    private List<Author> allAuthors;

    @PostConstruct
    public void init(){ loadAllAuthors(); }

    private void loadAllAuthors() { allAuthors = authorsDAO.loadAll(); }

    @Transactional
    public String createAuthor(){
        authorsDAO.persist(authorToCreate);
        return "index?faces-redirect=true";
    }
}
