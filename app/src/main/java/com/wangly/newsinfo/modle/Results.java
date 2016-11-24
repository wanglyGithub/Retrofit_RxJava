package com.wangly.newsinfo.modle;

/**
 * Created by wangly on 2016/11/24.
 */

public class Results {


    @Override
    public String toString() {
        return "ResultBean{" +
                "actors='" + actors + '\'' +
                ", movieid='" + movieid + '\'' +
                ", rating=" + rating +
                ", genres='" + genres + '\'' +
                ", runtime='" + runtime + '\'' +
                ", language='" + language + '\'' +
                ", title='" + title + '\'' +
                ", poster='" + poster + '\'' +
                ", writers='" + writers + '\'' +
                ", film_locations='" + film_locations + '\'' +
                ", directors='" + directors + '\'' +
                ", rating_count=" + rating_count +
                ", plot_simple='" + plot_simple + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                ", type=" + type +
                ", release_date='" + release_date + '\'' +
                ", also_known_as='" + also_known_as + '\'' +
                '}';
    }

    /**
     * movieid : 91881
     * rating : null
     * genres : 动作/冒险/科幻
     * runtime : 130 分钟
     * language : 英语
     * title : 钢铁侠3
     * poster : http://img31.mtime.cn/mg/2015/12/09/150156.26651061_270X405X4.jpg
     * writers : 沙恩·布莱克,德鲁·皮尔斯,...
     * film_locations : 美国|中国
     * directors : 沙恩·布莱克
     * rating_count : null
     * actors : 小罗伯特·唐尼 Robert Downey Jr.,格温妮丝·帕特洛 Gwyneth Paltrow,本·金斯利 Ben Kingsley,盖·皮尔斯 Guy Pearce
     * plot_simple :         托尼·斯塔克将遭遇一个拥有无穷力量的强敌的挑战。面对被毁灭殆尽的生活，无路可退的斯塔克必须依靠自己精良的高科技装备和过人的才智，保护自己和最亲近的人，同时揪出真正的幕后元凶。最终当他正面强敌，准备给予致命一击时，一直以来困扰斯塔克的问题——到底是战甲成就了他，还是他造就了这套战甲——也有了答案。
     * year : 2013
     * country : 美国|中国
     * type : null
     * release_date : 20130501
     * also_known_as : 铁甲奇侠3.....(香港译名),钢铁人3.....(台湾译名),铁人3
     */

    private String movieid;
    private Object rating;
    private String genres;
    private String runtime;
    private String language;
    private String title;
    private String poster;
    private String writers;
    private String film_locations;
    private String directors;
    private Object rating_count;
    private String actors;
    private String plot_simple;
    private String year;
    private String country;
    private Object type;
    private String release_date;
    private String also_known_as;

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public String getFilm_locations() {
        return film_locations;
    }

    public void setFilm_locations(String film_locations) {
        this.film_locations = film_locations;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public Object getRating_count() {
        return rating_count;
    }

    public void setRating_count(Object rating_count) {
        this.rating_count = rating_count;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot_simple() {
        return plot_simple;
    }

    public void setPlot_simple(String plot_simple) {
        this.plot_simple = plot_simple;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getAlso_known_as() {
        return also_known_as;
    }

    public void setAlso_known_as(String also_known_as) {
        this.also_known_as = also_known_as;
    }
}
