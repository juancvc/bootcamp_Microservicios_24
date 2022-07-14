package pe.com.nttdata.operators;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class Error {

    public void retry(){
        /*List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .concatWith(Flux.error(new RuntimeException("Error!")))
                .retry(1)
                .doOnNext(x -> System.out.println(x.toString()))
                .subscribe();*/
    }

    public void onError(){
      /*  List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .concatWith(Flux.error(new RuntimeException("Error!")))
                .onErrorReturn(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0))
                .subscribe(x -> System.out.println(x.toString()));*/
    }

    public void errorResume(){
     /*   List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .concatWith(Flux.error(new RuntimeException("Error!")))
                .onErrorResume(e -> Mono.just(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0)))
                .subscribe(x -> System.out.println(x.toString()));*/
    }

    public void errorMap(){
      /*  List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .concatWith(Flux.error(new RuntimeException("Error!")))
                .onErrorMap(e -> new InterruptedException(e.getMessage()))
                .subscribe(x -> System.out.println(x.toString()));*/
    }

}
