package pe.com.nttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.Person;
import pe.com.nttdata.service.inf.IPesonService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private IPesonService personService;

    @GetMapping
    public Flux<Person> listar(){
        return personService.findAll();
    }

    @PostMapping
    public Mono<Person> registrar(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping("/{dni}")
    public Flux<Person> listarPorDni(@PathVariable String dni){
        return personService.findPersonaByDni(dni);
    }

    @GetMapping("listar/{dni}")
    public Flux<Person> listarPorDni2(@PathVariable String dni){
        return personService.buscarPorDni(dni);
    }

    @PutMapping
    public Mono<Person> actualizar(@RequestBody Person person){
        return personService.update(person);
    }

    @DeleteMapping("delete")
    public Mono<Void> eliminar(@RequestBody Person person){
        return personService.delete(person);
    }

}
