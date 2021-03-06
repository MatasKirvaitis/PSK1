package lt.vu.mybatis.dao;

import lt.vu.mybatis.model.Genre;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface GenreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GENRE
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GENRE
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    int insert(Genre record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GENRE
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    Genre selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GENRE
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    List<Genre> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.GENRE
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    int updateByPrimaryKey(Genre record);

    List<Genre> selectGenresByBooks(Integer bookId);
    List<Genre> selectGenresByBooksFree(Integer bookId);
}