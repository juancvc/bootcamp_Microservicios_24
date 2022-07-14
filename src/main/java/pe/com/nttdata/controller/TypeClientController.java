package pe.com.nttdata.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.ClientType;
import pe.com.nttdata.service.inf.TypeClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/clientType")
public class TypeClientController {

    @Autowired
    private TypeClientService typeClientService;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @GetMapping("/listado")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ClientType> getAllClients(){
        LOGGER.info("Hizo la peticion de listado");
        return typeClientService.findAll();
    }


    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.OK)
    public Mono<ClientType> createClient(@RequestBody ClientType tipocliente){
        LOGGER.info("Hizo la peticion de nuevo");

        return typeClientService.save(tipocliente);
    }

    @GetMapping("/listado/{idTipoCliente}")
        public Flux<ClientType> findPersonById(@PathVariable String idTipoCliente){
            return typeClientService.findPersonById(idTipoCliente);
    }

    @DeleteMapping("/eliminar/{idTipoCliente}")
    public Mono<Void> deleteClient(@RequestBody ClientType tipoCliente){
        LOGGER.info("Hizo la peticion de eliminar por id");
        return typeClientService.eliminar(tipoCliente);
    }

    @PutMapping("/actualizar/{idTipoCliente}")
    public Mono<ClientType> updateClient(@RequestBody ClientType tipocliente,@PathVariable(value = "idTipoCliente") String idTipoCliente){

        LOGGER.info("Hizo la peticion de actualizar");
        tipocliente.setIdTipoCliente(idTipoCliente);
        return typeClientService.update(tipocliente);

    }
}
