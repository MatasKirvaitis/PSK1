package lt.vu.mybatis.model;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.ISBN
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    private String isbn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.TITLE
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.AUTHOR_ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    private Integer authorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.ID
     *
     * @return the value of PUBLIC.BOOK.ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.ID
     *
     * @param id the value for PUBLIC.BOOK.ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.ISBN
     *
     * @return the value of PUBLIC.BOOK.ISBN
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.ISBN
     *
     * @param isbn the value for PUBLIC.BOOK.ISBN
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.TITLE
     *
     * @return the value of PUBLIC.BOOK.TITLE
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.TITLE
     *
     * @param title the value for PUBLIC.BOOK.TITLE
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.AUTHOR_ID
     *
     * @return the value of PUBLIC.BOOK.AUTHOR_ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.AUTHOR_ID
     *
     * @param authorId the value for PUBLIC.BOOK.AUTHOR_ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}