package pe.com.nttdata.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.nttdata.model.Client;
import reactor.core.publisher.Flux;

@Repository
public interface ClientRepository extends ReactiveCrudRepository<Client, Integer> {

    @Query("{'codigo': ?0}")
    Flux<Client> findByCodigo(String codigo);

}
