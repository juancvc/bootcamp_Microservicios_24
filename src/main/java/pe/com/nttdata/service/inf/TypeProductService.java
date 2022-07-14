package pe.com.nttdata.service.inf;


import pe.com.nttdata.model.TypeProduct;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TypeProductService {

    Flux<TypeProduct> findAll();

    Mono<TypeProduct> save(TypeProduct tipoProducto);

    Mono<TypeProduct> update(TypeProduct tipoProducto);

    Flux<TypeProduct> findPersonById(String idTipoProducto);

    Mono<Void> eliminar(TypeProduct tipoProducto);

    Flux<TypeProduct> buscarporId(String idTipoProducto);
}
