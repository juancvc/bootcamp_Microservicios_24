package pe.com.nttdata.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.ExternalUser;
import pe.com.nttdata.repository.ExternalUserRepository;
import pe.com.nttdata.service.inf.ExternalUserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ExternalUserServiceImpl implements ExternalUserService {





    @Autowired
    ExternalUserRepository externalUserRepository;

    @Override
    public Flux<ExternalUser> findAll() {

        return externalUserRepository.findAll();
    }

    @Override
    public Flux<ExternalUser> findByCodigo(String codigo) {
        return externalUserRepository.findByCodigo(codigo);
    }

    @Override
    public Mono<ExternalUser> update(ExternalUser purse) {
        return externalUserRepository.update(purse);
    }

    @Override
    public Mono<ExternalUser> save(ExternalUser purse) {
        return externalUserRepository.save(purse);
    }

    @Override
    public Mono<ExternalUser> validateExistTransaction(int codigoTransaccion) {
        return externalUserRepository.validateExistTransaction(codigoTransaccion);
    }


















}
