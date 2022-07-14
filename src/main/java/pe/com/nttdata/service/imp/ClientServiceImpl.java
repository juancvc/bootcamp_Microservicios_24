package pe.com.nttdata.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.Client;
import pe.com.nttdata.repository.ClientRepository;
import pe.com.nttdata.service.inf.ClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository repository;

    @Override
    public Flux<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Client> save(Client cliente) {
        return repository.save(cliente);
    }

    /*@Override
    public Flux<Cliente> findClientByCodigo(String codigo){
        return repository.findAll().filter(x -> x.getCodigo().equals(codigo));
    }*/

    @Override
    public Flux<Client> findClientByCodigo(String codigo){
        return repository.findByCodigo(codigo);
    }

    /*@Override
    public Flux<Cliente> findClientByNombre(String nombre){
        return repository.findClientByNombre(nombre);
    }*/
}
