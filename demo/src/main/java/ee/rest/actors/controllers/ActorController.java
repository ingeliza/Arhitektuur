package ee.rest.actors.controllers;

import java.util.List;

import ee.rest.actors.dto.Actor;
import ee.rest.actors.services.ActorService;
import org.springframework.web.bind.annotation.*;


public class ActorController {

  public ActorService service;

  @GetMapping("/actors")
  public List<Actor> findAll(){
    return null;
  }

  @GetMapping("/actors/{id}")
  Actor oneActor(@PathVariable Long id) {
      return null;
  }

  @PostMapping("/actors")
  Actor newActor(@RequestBody Actor newActor){
      return null;
  }

  @PutMapping("/actors/{id}")
  Actor updateActor(@RequestBody Actor newActor, @PathVariable Long id) {
    return null;
  }

  @DeleteMapping("/actors/{id}")
  void deleteActor(@PathVariable Long id) {
  }

}