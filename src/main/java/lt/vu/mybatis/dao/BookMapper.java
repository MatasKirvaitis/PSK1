package lt.vu.mybatis.dao;

import lt.vu.mybatis.model.Book;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    Book selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    List<Book> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.BOOK
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    int updateByPrimaryKey(Book record);
}