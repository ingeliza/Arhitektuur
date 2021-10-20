package ee.rest.actors.dto;

import ee.rest.movies.dto.Movie;
import lombok.Data;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Data
public class Actor{

    public int id;
    public String name;
    public int age;
    public List<Movie> movies;

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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public List getMovies(){ return movies; }
    public void setMovies(List movies) {
        this.movies = movies;
    }

}