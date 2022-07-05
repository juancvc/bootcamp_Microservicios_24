package pe.com.nttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.Client;
import pe.com.nttdata.service.ClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cliente")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    public Flux<Client> listar(){
        return service.findAll();
    }

    @PostMapping
    public Mono<Client> save(@RequestBody Client cliente){
        return service.save(cliente);
    }

    @GetMapping("{codigo}")
    public Flux<Client> save(@PathVariable String codigo){
        return service.findClientByCodigo(codigo);
    }

}
