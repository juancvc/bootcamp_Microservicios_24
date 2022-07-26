package pe.com.nttdata.service.inf;

import pe.com.nttdata.model.Client;
import pe.com.nttdata.model.Product;
import pe.com.nttdata.model.Purse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PurseService {

    Flux<Purse> findAll();

    Mono<Purse> save(Purse purse);
    Mono<Purse> update(Purse purse);
    Flux<Purse> findPurseByCodigo(String codigo);
    Mono<Purse> receiveMoney(Purse purse);
    Mono<Purse> sendMoney(Purse purse);

    Mono<Purse> checkBalance(String codigo);
}
