package pe.com.nttdata.service;

import pe.com.nttdata.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {

    Flux<Client> findAll();

    Mono<Client> save(Client cliente);

    Flux<Client> findClientByCodigo(String codigo);

    //Flux<Cliente> findClientByNombre(String nombre);
}
