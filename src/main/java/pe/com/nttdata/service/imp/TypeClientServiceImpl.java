package pe.com.nttdata.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.ClientType;
import pe.com.nttdata.repository.TypeClientRepository;
import pe.com.nttdata.service.inf.TypeClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TypeClientServiceImpl implements TypeClientService {
    @Autowired
    TypeClientRepository tipoClienteRepository;

    @Override
    public Flux<ClientType> findAll() {

        return tipoClienteRepository.findAll();
    }

    @Override
    public Mono<ClientType> save(ClientType tipoCliente) {

        return tipoClienteRepository.save(tipoCliente);
    }

    @Override
    public Mono<ClientType> update(ClientType tipoCliente) {

        return null;
    }

    @Override
    public Flux<ClientType> findPersonById(String idTipoCliente) {
        return tipoClienteRepository.findAll().filter(x->x.getIdTipoCliente().equals(idTipoCliente));
    }

    @Override
    public Mono<Void> eliminar(ClientType tipoCliente){

        return tipoClienteRepository.delete(tipoCliente);
    }

    public Flux<ClientType> buscarporId(String idTipoCliente){

        return tipoClienteRepository.buscarporId(idTipoCliente);
    }
}
