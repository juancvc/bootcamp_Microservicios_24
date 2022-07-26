package pe.com.nttdata.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.Purse;
import pe.com.nttdata.repository.PurseRepository;
import pe.com.nttdata.service.inf.PurseService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PurseServiceImpl implements PurseService {





    @Autowired
    PurseRepository purseRepository;

    @Override
    public Flux<Purse> findAll() {

        return purseRepository.findAll();
    }



    @Override
    public Flux<Purse> findPurseByCodigo(String codigo) {
        return purseRepository.findAll().filter(x-> x.getIdMonedero()==codigo);
    }

    @Override
    public Mono<Purse> receiveMoney(Purse purse) {
        return purseRepository.receiveMoney(purse);
    }

    @Override
    public Mono<Purse> sendMoney(Purse purse) {
        return purseRepository.sendMoney(purse);
    }

    @Override
    public Mono<Purse> checkBalance(String codigo) {
        return purseRepository.checkBalance(codigo);
    }

    @Override
    public Mono<Purse> save(Purse purse) {
        return purseRepository.save(purse);
    }

    @Override
    public Mono<Purse> update(Purse purse) {
        return purseRepository.update(purse);
    }













}
