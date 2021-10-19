package ee.rest.actors.controllers;

import java.util.List;

import ee.rest.actors.dto.Actor;
import ee.rest.actors.services.ActorService;


public class ActorController {

  public ActorService service;

  @GetMapping("/actors")
  public List<Actor> findAll(){
    return service.findAll();
  }

  @GetMapping("/actors/{id}")
  Actor oneActor(@PathVariable Long id) {
      return service.findById(id);
  }

  @PostMapping("/actors")
  Actor newActor(@RequestBody Actor newActor){
      return service.saveActor(newActor);
  }

  @PutMapping("/actors/{id}")
  Actor updateActor(@RequestBody Actor newActor, @PathVariable Long id) {
    return service.findById(id)
    .map(actor -> {
      actor.setName(newActor.getName());
      actor.setAge(newActor.getAge());
      return service.save(actor);
    })
    .orElseGet(() -> {
      newActor.setId(id);
      return service.save(newActor);
    });
  }

  @DeleteMapping("/actors/{id}")
  void deleteActor(@PathVariable Long id) {
      service.deleteById(id);
  }

}