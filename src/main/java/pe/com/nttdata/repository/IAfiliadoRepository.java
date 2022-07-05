package pe.com.nttdata.repository;

import pe.com.nttdata.model.Afiliado;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAfiliadoRepository {

    Mono<Afiliado> registrar(Afiliado afiliado);
    Mono<Afiliado> modificar(Afiliado afiliado);
    Flux<Afiliado> listar();
    Mono<Afiliado> listarPorId(Integer id);
    Mono<Void> eliminar(Integer id);

}
