package pe.com.nttdata.service.inf;

import pe.com.nttdata.model.ExternalUser;
import pe.com.nttdata.model.Purse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ExternalUserService {

    Flux<ExternalUser> findAll();
    Flux<ExternalUser> findByCodigo(String codigo);
    Mono<ExternalUser> update(ExternalUser purse);

    Mono<ExternalUser> save (ExternalUser purse);

    Mono<ExternalUser> validateExistTransaction(int nroTransaccion);
}
