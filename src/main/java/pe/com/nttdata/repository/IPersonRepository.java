package pe.com.nttdata.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.nttdata.model.Person;
import reactor.core.publisher.Flux;

@Repository
public interface IPersonRepository extends ReactiveCrudRepository<Person, Integer> {

    @Query("{'dni': ?0}")
    Flux<Person> buscarPorDni(String dni);

}
