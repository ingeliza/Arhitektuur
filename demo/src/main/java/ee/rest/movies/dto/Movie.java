package ee.rest.movies.dto;

import ee.rest.actors.dto.Actor;
import lombok.Data;

import java.time.Year;
import java.util.List;


@Data
public class Movie {

    public int id;
    public String name;
    public Year year;
    public List<Actor> actors;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Year getYear() {
        return year;
    }
    public void setYear(Year year) {
        this.year = year;
    }

    public List getActors(){ return actors; }
    public void setActors(List actors) {
        this.actors = actors;
    }

}
