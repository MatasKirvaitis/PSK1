package lt.vu.persistence;

import lt.vu.entities.Book;
import lt.vu.usecases.Books;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class BooksDAO {
    @Inject
    private EntityManager em;

    public List<Book> loadAll(Integer id){
        return em.createNamedQuery("Book.findAll", Book.class).setParameter("authorId", id).getResultList();
    }

    public void persist(Book book){
        this.em.persist(book);
    }

    public Book findOne(Integer id){
        return em.find(Book.class, id);
    }

    public Book update(Book book){
        return em.merge(book);
    }
}
