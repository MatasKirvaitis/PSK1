package lt.vu.mybatis.model;

public class Genre {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.GENRE.ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.GENRE.GENRE_NAME
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    private String genreName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.GENRE.ID
     *
     * @return the value of PUBLIC.GENRE.ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.GENRE.ID
     *
     * @param id the value for PUBLIC.GENRE.ID
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.GENRE.GENRE_NAME
     *
     * @return the value of PUBLIC.GENRE.GENRE_NAME
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public String getGenreName() {
        return genreName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.GENRE.GENRE_NAME
     *
     * @param genreName the value for PUBLIC.GENRE.GENRE_NAME
     *
     * @mbg.generated Mon May 11 21:42:15 EEST 2020
     */
    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
    }
}