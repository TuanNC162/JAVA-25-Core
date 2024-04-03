package entity;

import java.util.List;

public class MovieCategories

{

    private Movie movie;
    private List<String> categories;


    public MovieCategories(Movie movie, List<String> categories) {
        this.movie = movie;
        this.categories = categories;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<String> getCategories() {
        return categories;
    }
}
