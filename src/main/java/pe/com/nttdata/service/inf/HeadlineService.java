package pe.com.nttdata.service.inf;


import pe.com.nttdata.model.Headline;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HeadlineService {
    Flux<Headline> findAll();

    Mono<Headline> save(Headline persona);

    Mono<Headline> update(Headline persona);

    Flux<Headline> findPersonById(String id);

    Mono<Void> delete(Headline titular);

    Flux<Headline> findbyId(String idTitular);
}
