package pe.com.nttdata.service.inf;

import pe.com.nttdata.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPesonService {

    Flux<Person> findAll();

    Mono<Person> save(Person persona);

    Mono<Person> update(Person persona);

    Flux<Person> findPersonaByDni(String dni);

    public Mono<Void> delete(Person persona);

    Flux<Person> buscarPorDni(String dni);

}
