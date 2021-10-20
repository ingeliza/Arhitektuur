package ee.rest.movies.dto;

import lombok.Data;

import java.time.Year;


@Data
public class Movie {

    public Long id;
    public String name;
    public Year year;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
