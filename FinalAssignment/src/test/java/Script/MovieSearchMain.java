package Script;

import Commons.Driver;
import Pages.MovieSearch;
import org.junit.Test;

public class MovieSearchMain extends Driver {

    @Test
    public void validMovieSearch() {
        MovieSearch movieSearch = new MovieSearch(driver);
        movieSearch.removePopUp();
        movieSearch.searchMovie("Fantasy Island");
        movieSearch.viewMovieDetails();
    }

    @Test
    public void inValidMovieSearch() throws InterruptedException {
        MovieSearch movieSearch = new MovieSearch(driver);
        movieSearch.removePopUp();
        movieSearch.searchMovie("qq");
        movieSearch.viewMovieDetails();
    }
}
