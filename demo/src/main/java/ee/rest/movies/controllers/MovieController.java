package ee.rest.movies.controllers;

import java.util.List;

import ee.rest.movies.services.MovieService;
import ee.rest.movies.dto.Movie;
import org.springframework.web.bind.annotation.*;


public class MovieController {

  public MovieService service;

  @GetMapping("/movies")
  public List<Movie> findAll(){
    return service.mockMovies();
  }

  @GetMapping("/movies/{id}")
  Movie oneMovie(@PathVariable int id) {
      return service.mockOneMovie(id);
  }

  @PostMapping("/movies")
  Movie newmovie(@RequestBody Movie newmovie){
      return null;
  }

  @PutMapping("/movies/{id}")
  Movie updateMovie(@RequestBody Movie newmovie, @PathVariable int id) {
    return null;
  }

  @DeleteMapping("/movies/{id}")
  void deleteMovie(@PathVariable int id) {

  }

}