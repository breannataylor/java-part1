package net.flix;

public class Movie {
    //properties
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // constructors - called when client says 'new'
    // be consistent in order of parameters

    public Movie (String title) {
        setTitle(title);
    }

    public Movie (String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie (String title, Integer releaseYear) {
        this(title);                    // delegate to the 1-arg String ctor for title
        setReleaseYear(releaseYear);    // delegates to setter (hand types)
    }
    public Movie (String title, Integer releaseYear, Double revenue) {
        this(title, releaseYear);       //delegate to ctor above
        setRevenue(revenue);            // delegates to setter (hand typed)
    }

    public Movie (String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue);
        setRating(rating);
        setGenre(genre);
    }
    //business methods - not shown
    // pause();
    // play();
    // rewind();
    //fastForward ();

    //accessor methods - provide 'controlled access' to object fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {

        // TODO: make null and dollar amount revenue work. Use if else statement.

        String revenueFormat = (getRevenue() == null) ? "%s" : "%,.2f";

        return String.format("Move title = %s, releaseYear = %s, revenue = " + revenueFormat + ", rating = %s, genre = %s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

    }
}