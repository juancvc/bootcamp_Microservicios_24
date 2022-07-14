package pe.com.nttdata.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.DetailProduct;
import pe.com.nttdata.service.inf.DetailProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;

@Slf4j
@RestController
@RequestMapping("/api/detailproduct")
public class DetailProductController {
    @Autowired
    private DetailProductService detailProductService;

    @GetMapping("/listado")
    public Flux<DetailProduct> listar(){
        return detailProductService.findAll();
    }

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.OK)
    public Mono<DetailProduct> createProduct(@RequestBody DetailProduct detalleProducto){
        LOGGER.info("Hizo la peticion de nuevo");

        return detailProductService.save(detalleProducto);
    }

    @GetMapping("/listado/{idDetalleProducto}")
    public Flux<DetailProduct> findPersonById(@PathVariable String idDetalleProducto){
        return detailProductService.findPersonById(idDetalleProducto);
    }

    @GetMapping("/listado2/{idDetalleProducto}")
    public Flux<DetailProduct> findProductById2(@PathVariable String idDetalleProducto){
        return detailProductService.buscarporId(idDetalleProducto);
    }


    @DeleteMapping("/eliminar/{idDetalleProducto}")
    public Mono<Void> deleteProduct(@RequestBody DetailProduct detalleProducto){
        LOGGER.info("Hizo la peticion de eliminar por id");
        return detailProductService.eliminar(detalleProducto);
    }

    @PutMapping("/actualizar/{idDetalleProducto}")
    public Mono<DetailProduct> updateProduct(@RequestBody DetailProduct detalleProducto,@PathVariable(value = "idDetalleProducto") String idDetalleProducto){

        LOGGER.info("Hizo la peticion de actualizar");
        detalleProducto.setIdDetalleProducto(idDetalleProducto);
        return detailProductService.update(detalleProducto);

    }
}
