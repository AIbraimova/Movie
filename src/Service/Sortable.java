package Service;

import Model.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieName(int num,List<Movie> movies);
    void sortByYear(int num,List<Movie>movies);
    void sortByDirector(int num,List<Movie>movies);
}

