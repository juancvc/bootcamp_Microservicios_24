package pe.com.nttdata.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.Headline;
import pe.com.nttdata.service.inf.HeadlineService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;

@Slf4j
@RestController
@RequestMapping("/api/headline")
public class HeadlineController {

    @Autowired
    private HeadlineService headlineService;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping("/listado")
    public Flux<Headline> listar(){
        return headlineService.findAll();
    }


    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Headline> save(@RequestBody Headline titular){
        LOGGER.info("Hizo la peticion de nuevo");

        return headlineService.save(titular);
    }

    @GetMapping("/listado/{idTitular}")
    public Flux<Headline> findPersonById(@PathVariable String idTitular){
        return headlineService.findPersonById(idTitular);
    }
/*
    @GetMapping("/listado2/{idTitular}")
    public Flux<Headline> findPersonById2(@PathVariable String idTitular){
        return headlineService.buscarporId(idTitular);
    }*/

/*
    @DeleteMapping("/eliminar/{idTitular}")
    public Mono<Void> deletePerson(@RequestBody Headline titular){
        LOGGER.info("Hizo la peticion de eliminar por id");
        return headlineService.eliminar(titular);
    }*/

    @PutMapping("/actualizar/{idTitular}")
    public Mono<Headline> update(@RequestBody Headline titular,@PathVariable(value = "idTitular") String idTitular){

        LOGGER.info("Hizo la peticion de actualizar");
        titular.setIdTitular(idTitular);
        return headlineService.update(titular);

    }
}
