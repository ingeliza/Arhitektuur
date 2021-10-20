package ee.rest.actors.services;

import ee.rest.actors.dto.Actor;
import ee.rest.movies.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class ActorService {

    public List<Actor> mockActors(){
        List<Actor> actors = new ArrayList<>();
        Actor actor1 = new Actor();
        actor1.setId(1);
        actor1.setName("Markus Mänd");
        actor1.setAge(34);

        List<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie();
        movie1.setId(12);
        movie1.setName("Moonlight");
        movie1.setYear(null);
        movies.add(movie1);

        actor1.setMovies(movies);

        return actors;
    }

    public Actor mockOneActor(Integer id){
        Actor actor1 = new Actor();
        actor1.setId(id);
        actor1.setName("Merle Saabas");
        actor1.setAge(54);
        return actor1;
    }

    public Actor mockNewActor(Actor actor1){
        actor1.setId(3);
        actor1.setName("Mari Maasikas");
        actor1.setAge(19);
        return actor1;
    }

    public Actor mockUpdateActor(Actor actor1, Integer id){
        actor1.setId(3);
        actor1.setName("Mari Männa");
        actor1.setAge(19);
        return actor1;
    }

    public Actor mockDeleteActor(int id){
        Actor actor1 = new Actor();
        actor1.setId(2);
        actor1.getId();
        return actor1;
    }


}
