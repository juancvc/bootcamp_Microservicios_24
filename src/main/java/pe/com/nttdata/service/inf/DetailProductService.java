package pe.com.nttdata.service.inf;


import pe.com.nttdata.model.DetailProduct;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DetailProductService {
    Flux<DetailProduct> findAll();

    Mono<DetailProduct> save(DetailProduct detalleProducto);

    Mono<DetailProduct> update(DetailProduct detalleProducto);

    Flux<DetailProduct> findPersonById(String id);

    Mono<Void> eliminar(DetailProduct detalleProducto);

    Flux<DetailProduct> buscarporId(String idDetalleProducto);
}
