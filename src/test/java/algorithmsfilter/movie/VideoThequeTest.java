package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VideoThequeTest {


    @Test
    void searchMovieByRatingAndCategoryTest() {
        List<Movie> toTest = Arrays.asList(
                new Movie("a", Category.DRAMA, 3),
                new Movie("a", Category.DRAMA, 3),
                new Movie("a", Category.FANTASY, 4),
                new Movie("a", Category.FANTASY, 4)
        );
        VideoTheque videoTheque = new VideoTheque(toTest);

        assertEquals(2,videoTheque.searchMovieByRatingAndCategory(Category.FANTASY).size());
        assertEquals(0,videoTheque.searchMovieByRatingAndCategory(Category.DRAMA).size());

    }
}