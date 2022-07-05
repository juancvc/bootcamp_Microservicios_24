package pe.com.nttdata.operators;

import pe.com.nttdata.model.Afiliado;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Condicion {

    public void defaultIfEmpty(){
        Mono.just(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0))
                .defaultIfEmpty(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0))
                .subscribe(x -> System.out.println(x.toString()));
    }

    public void takeUntil(){
        List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .takeUntil(p -> p.getAportes() == 50000.0)
                .subscribe(x -> System.out.println(x.toString()));
    }

    public void timeOut() throws InterruptedException {
        List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .delayElements(Duration.ofSeconds(3))
                .timeout(Duration.ofSeconds(2))
                .subscribe(x -> x.toString());

        Thread.sleep(10000);
    }

}
