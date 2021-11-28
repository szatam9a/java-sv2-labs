package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movieList = new ArrayList<>();

    public VideoTheque(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
    public void addMovie(Movie movie){
        movieList.add(movie);
    }
    public List<Movie> searchMovieByRatingAndCategory(Category category){
        List<Movie> result= new ArrayList<>();
        for (Movie actual:movieList
             ) {
            if (actual.getCategory()==category && actual.getRating() > 3){
                result.add(actual);
            }
        }
    return result;}
}
