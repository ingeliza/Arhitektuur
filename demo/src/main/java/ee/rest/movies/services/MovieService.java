package ee.rest.movies.services;

import ee.rest.actors.dto.Actor;
import ee.rest.movies.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    public List<Movie> mockMovies(){
        List<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie();
        movie1.setId(1);
        movie1.setName("They are back");
        movie1.setYear(null);

        List<Actor> actors = new ArrayList<>();
        Actor actor1 = new Actor();
        actor1.setId(12);
        actor1.setName("Mariell Greip");
        actor1.setAge(43);
        actors.add(actor1);

        actor1.setMovies(movies);

        return movies;
    }

    public Movie mockOneMovie(Integer id){
        Movie movie1 = new Movie();
        movie1.setId(id);
        movie1.setName("Helped");
        movie1.setYear(null);
        return movie1;
    }
}
