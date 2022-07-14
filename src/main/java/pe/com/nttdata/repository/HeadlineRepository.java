package pe.com.nttdata.repository;


import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.com.nttdata.model.Headline;
import reactor.core.publisher.Flux;

public interface HeadlineRepository extends ReactiveCrudRepository<Headline,String> {

    @Query("{'idTitular':?0}")
    Flux<Headline> buscarporIdTitular(String idTitular);
}
