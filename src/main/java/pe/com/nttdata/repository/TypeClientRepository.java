package pe.com.nttdata.repository;


import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.com.nttdata.model.ClientType;
import reactor.core.publisher.Flux;

public interface TypeClientRepository extends ReactiveCrudRepository<ClientType,String> {
    @Query("{'idTipoCliente':?0}")
    Flux<ClientType> buscarporId(String idTipoCliente);
}
