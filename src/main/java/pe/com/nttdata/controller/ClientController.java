package pe.com.nttdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.Client;
import pe.com.nttdata.service.inf.ClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping("/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;
    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @GetMapping
    public Flux<Client> findAll(){
        return clientService.findAll();
    }

    @PostMapping("/nuevo")
    public Mono<Client> save(@RequestBody Client cliente){
        LOGGER.info("Se registro correctamente");
        return clientService.save(cliente);
    }

    @GetMapping("{codigo}")
    public Flux<Client> findClientByCodigo(@PathVariable String codigo){
        return clientService.findClientByCodigo(codigo);
    }

}
