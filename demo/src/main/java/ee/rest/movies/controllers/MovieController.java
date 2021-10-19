package ee.rest.movies.controllers;

import java.util.List;

import ee.rest.movies.dto.movie;
import ee.rest.movies.services.MovieService;
import ee.rest.movies.services.movieService;
import ee.rest.movies.dto.Movie;


public class MovieController {

  public MovieService service;

  @GetMapping("/movies")
  public List<Movie> findAll(){
    return service.findAll();
  }

  @GetMapping("/movies/{id}")
  Movie oneMovie(@PathVariable Long id) {
      return service.findById(id);
  }

  @PostMapping("/movies")
  Movie newmovie(@RequestBody Movie newmovie){
      return service.saveMovie(newmovie);
  }

  @PutMapping("/movies/{id}")
  Movie updateMovie(@RequestBody Movie newmovie, @PathVariable Long id) {
    return service.findById(id)
    .map(movie -> {
      movie.setName(newMovie.getName());
      movie.setYear(newMovie.getYear());
      return service.save(movie);
    })
    .orElseGet(() -> {
      newMovie.setId(id);
      return service.save(newMovie);
    });
  }

  @DeleteMapping("/movies/{id}")
  void deleteMovie(@PathVariable Long id) {
      service.deleteById(id);
  }

}