package pe.com.nttdata.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.nttdata.model.Client;
import pe.com.nttdata.model.ExternalUser;
import pe.com.nttdata.model.Purse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ExternalUserRepository extends ReactiveCrudRepository<ExternalUser, Integer> {

    @Query("{'codigo': ?0}")
    Flux<ExternalUser> findByCodigo(String codigo);

    Mono<ExternalUser> update(ExternalUser purse);

    Mono<ExternalUser> save (ExternalUser purse);

    Mono<ExternalUser> validateExistTransaction(int nroTransaccion);
}
