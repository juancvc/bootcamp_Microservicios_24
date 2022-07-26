package pe.com.nttdata.service.inf;


import pe.com.nttdata.model.Client;
import pe.com.nttdata.model.DetailProduct;
import pe.com.nttdata.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    Flux<Product> findAll();

    Mono<Product> save(Product product);

    Mono<Product> update(Product product);

    Flux<Product> findProductById(String id);

    Mono<Void> delete(Product product);

    Mono<Product> finfById(String idProduct);

    Mono<Product> validateExistsDebt(Product product);
}
