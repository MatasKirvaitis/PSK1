package lt.vu.mybatis.dao;

import lt.vu.mybatis.model.BookGenres;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface BookGenresMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK_GENRES
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    int insert(BookGenres record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK_GENRES
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    List<BookGenres> selectAll();
}