package pe.com.nttdata.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.com.nttdata.model.DetailProduct;
import reactor.core.publisher.Flux;

public interface DetailProductRepository extends ReactiveCrudRepository<DetailProduct,String> {
    @Query("{'idDetalleProducto':?0}")
    Flux<DetailProduct> buscarporIdDetalleProducto(String idDetalleProducto);
}
