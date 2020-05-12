package lt.vu.persistence;

import lt.vu.entities.Genre;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class GenresDAO {
    @Inject
    private EntityManager em;

    public List<Genre> loadAll() {
        return em.createNamedQuery("Genre.loadAll", Genre.class).getResultList();
    }

    public void persist(Genre genre){
        this.em.persist(genre);
    }

    public Genre findOne(Integer id){ return em.find(Genre.class, id); }

    public Genre update(Genre genre){
        return em.merge(genre);
    }
}
