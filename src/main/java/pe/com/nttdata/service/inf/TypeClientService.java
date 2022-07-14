package pe.com.nttdata.service.inf;


import pe.com.nttdata.model.ClientType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TypeClientService {

    Flux<ClientType> findAll();

    Mono<ClientType> save(ClientType tipoCliente);

    Mono<ClientType> update(ClientType tipoCliente);

    Flux<ClientType> findPersonById(String id);

    Mono<Void> eliminar(ClientType tipoCliente);

    Flux<ClientType> buscarporId(String idTipoCliente);
}
