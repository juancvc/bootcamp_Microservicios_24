package pe.com.nttdata.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.com.nttdata.model.Client;
import pe.com.nttdata.model.DetailProduct;
import pe.com.nttdata.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductRepository extends ReactiveCrudRepository<Product,String> {
    @Query("{'idProducto':?0}")
    Flux<Product> findByIdProduct(String idProducto);

    Mono<Product> validateExistsDebt(Product product);

    Mono<Product> update(Product product);
}
