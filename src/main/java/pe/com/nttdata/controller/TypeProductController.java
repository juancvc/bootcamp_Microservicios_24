package pe.com.nttdata.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.TypeProduct;
import pe.com.nttdata.service.inf.TypeProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/typeproduct")
public class TypeProductController {
    @Autowired
    private TypeProductService typeProductService;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @GetMapping("/listado")
    @ResponseStatus(HttpStatus.OK)
    public Flux<TypeProduct> getAllProducts(){
        LOGGER.info("Hizo la peticion de listado");
        return typeProductService.findAll();
    }


    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.OK)
    public Mono<TypeProduct> createProduct(@RequestBody TypeProduct tipoProducto){
        LOGGER.info("Hizo la peticion de nuevo");

        return typeProductService.save(tipoProducto);
    }

    @GetMapping("/listado/{idTipoProducto}")
    public Flux<TypeProduct> findPersonById(@PathVariable String idTipoProducto){
        return typeProductService.findPersonById(idTipoProducto);
    }

    @DeleteMapping("/eliminar/{idTipoProducto}")
    public Mono<Void> deleteProduct(@RequestBody TypeProduct tipoProducto){
        LOGGER.info("Hizo la peticion de eliminar por id");
        return typeProductService.eliminar(tipoProducto);

    }

    @PutMapping("/actualizar/{idTipoProducto}")
    public Mono<TypeProduct> updateProduct(@RequestBody TypeProduct tipoProducto,@PathVariable(value = "idTipoProducto") String idTipoProducto){

        LOGGER.info("Hizo la peticion de actualizar");
        tipoProducto.setIdTipoProducto(idTipoProducto);
        return typeProductService.save(tipoProducto);

    }
}
