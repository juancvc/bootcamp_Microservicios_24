package pe.com.nttdata.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.com.nttdata.model.TypeProduct;
import reactor.core.publisher.Flux;

public interface TypeProductRepository extends ReactiveCrudRepository<TypeProduct,String> {

    @Query("{'idTipoProducto':?0}")
    Flux<TypeProduct> buscarporIdTipoProducto(String idTipoProducto);
}
