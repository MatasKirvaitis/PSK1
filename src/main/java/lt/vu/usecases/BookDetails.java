package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Book;
import lt.vu.mybatis.model.Genre;
import lt.vu.mybatis.dao.BookGenresMapper;
import lt.vu.mybatis.dao.GenreMapper;
import lt.vu.mybatis.model.BookGenres;
import lt.vu.persistence.BooksDAO;

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
public class BookDetails {

    @Inject
    private BooksDAO booksDAO;

    @Getter @Setter
    private Book book = new Book();

    @Inject
    private GenreMapper genreMapper;

    @Inject
    private BookGenresMapper bookGenresMapper;

    @Getter @Setter
    private BookGenres bookGenres = new BookGenres();

    @Getter @Setter
    private Genre genre = new Genre();

    @Getter
    private List<Genre> genreList;

    @Getter
    private List<Genre> genreListFree;

    @PostConstruct
    public void init(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer bookId = Integer.parseInt(requestParameters.get("bookId"));
        this.book = booksDAO.findOne(bookId);
        loadBook(bookId);
        loadBookGenres(bookId);
        loadBookFreeGenres(bookId);
    }

    private void loadBookGenres(Integer bookId){
        this.genreList = genreMapper.selectGenresByBooks(bookId);
    }

    private void loadBookFreeGenres(Integer bookId) { this.genreListFree = genreMapper.selectGenresByBooksFree(bookId); }

    private void loadBook(Integer bookId) { this.book = booksDAO.findOne(bookId); }

    @Transactional
    public String addGenre(){
        bookGenres.setBooksId(this.book.getId());
        bookGenres.setGenresId(this.genre.getId());
        bookGenresMapper.insert(bookGenres);
        return "bookDetails?faces-redirect=true&bookId=" + this.book.getId();
    }
}
