package pe.com.nttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.Afiliado;
import pe.com.nttdata.repository.IAfiliadoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/afiliados")
public class AfiliadoController {

    @Autowired
    private IAfiliadoRepository repo;

    @GetMapping
    public Flux<Afiliado> listar(){
        return repo.listar();
    }

    @GetMapping("/{id}")
    public Mono<Afiliado> listarPorId(@PathVariable("id") Integer id){
        return  repo.listarPorId(id);
    }

    @PostMapping
    public Mono<Afiliado> registrar(@RequestBody Afiliado afiliado){
        return repo.registrar(afiliado);
    }

    @PutMapping
    public Mono<Afiliado> modificar(@RequestBody Afiliado afiliado){
        return repo.modificar(afiliado);
    }

    @DeleteMapping
    public Mono<Void> eliminar(@PathVariable("id") Integer id){
        return repo.eliminar(id);
    }
}
