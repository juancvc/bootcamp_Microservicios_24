package pe.com.nttdata.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.model.DetailProduct;
import pe.com.nttdata.model.Product;
import pe.com.nttdata.service.inf.DetailProductService;
import pe.com.nttdata.service.inf.ProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;

@Slf4j
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private DetailProductService detailProductService;

    @Autowired
    private ProductService productService;

    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping("/listado")
    public Flux<Product> listar(){
        return productService.findAll();
    }




    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Product> createProduct(@RequestBody Product product){
        LOGGER.info("Hizo la peticion de nuevo");

        return productService.save(product);
    }

    @GetMapping("/list/{idProduct}")
    public Flux<Product> findPersonById(@PathVariable String idProduct){
        return productService.findProductById(idProduct);
    }

    @GetMapping("/list2/{idProduct}")
    public Flux<Product> findProductById2(@PathVariable String idProduct){
        return productService.findProductById(idProduct);
    }


    @DeleteMapping("/delete/{idProduct}")
    public Mono<Void> deleteProduct(@RequestBody Product product){
        LOGGER.info("Hizo la peticion de eliminar por id");
        return productService.delete(product);
    }

    @PutMapping("/update/{idProduct}")
    public Mono<Product> updateProduct(@RequestBody Product product,
                                             @PathVariable(value = "idDetalleProducto") String idProduct){

        LOGGER.info("Hizo la peticion de actualizar");
        product.setIdProducto(idProduct);
        return productService.update(product);

    }

    /**validamos que si un cliente tiene una deuda de un producto de credito solicitado no se permita agregar un nuevo producto***/


}
