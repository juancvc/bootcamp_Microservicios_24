package pe.com.nttdata.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.nttdata.model.Client;
import pe.com.nttdata.model.Purse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PurseRepository extends ReactiveCrudRepository<Purse, Integer> {

    @Query("{'codigo': ?0}")
    Flux<Client> findByCodigo(String codigo);

    Mono<Purse> update(Purse purse);

    Mono<Purse> sendMoney(Purse purse);
    Mono<Purse> receiveMoney(Purse purse);

    Mono<Purse> checkBalance(String codigo);
}
