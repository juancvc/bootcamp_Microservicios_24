package pe.com.nttdata.operators;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class Combinacion {

    public void merge(){
        /*List<Afiliado> afiliados1 = new ArrayList<>();
        afiliados1.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados1.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados1.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados1.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        List<Afiliado> afiliados2 = new ArrayList<>();
        afiliados2.add(new Afiliado(5, "Rocio", "Salas",  "51111111", 70000.0));
        afiliados2.add(new Afiliado(6, "Andres", "Ames",  "45523344", 60000.0));
        afiliados2.add(new Afiliado(7, "Pablo", "Robles",  "41224455", 20000.0));
        afiliados2.add(new Afiliado(8, "Julio", "Torres",  "51223344", 80000.0));

        List<Afp> afps = new ArrayList<>();
        afps.add(new Afp(1, "Integra"));
        afps.add(new Afp(2, "Prima"));

        Flux<Afiliado> flux1 = Flux.fromIterable(afiliados1);
        Flux<Afiliado> flux2 = Flux.fromIterable(afiliados2);
        Flux<Afp> flux3  = Flux.fromIterable(afps);

        Flux.merge(flux1, flux2, flux3)
                .subscribe(p -> System.out.println(p.toString()));*/
    }

    public void zip(){
     /*   List<Afiliado> afiliados1 = new ArrayList<>();
        afiliados1.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados1.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados1.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados1.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        List<Afiliado> afiliados2 = new ArrayList<>();
        afiliados2.add(new Afiliado(5, "Rocio", "Salas",  "51111111", 70000.0));
        afiliados2.add(new Afiliado(6, "Andres", "Ames",  "45523344", 60000.0));
        afiliados2.add(new Afiliado(7, "Pablo", "Robles",  "41224455", 20000.0));
        afiliados2.add(new Afiliado(8, "Julio", "Torres",  "51223344", 80000.0));

        List<Afp> afps = new ArrayList<>();
        afps.add(new Afp(1, "Integra"));
        afps.add(new Afp(2, "Prima"));

        Flux<Afiliado> flux1 = Flux.fromIterable(afiliados1);
        Flux<Afiliado> flux2 = Flux.fromIterable(afiliados2);
        Flux<Afp> flux3  = Flux.fromIterable(afps);
*/
        /*Flux.zip(flux1, flux2, (p1, p2) -> String.format("Flux1: %s, Flux2: %s", p1, p2))
                .subscribe(x -> System.out.println(x));*/
/*
        Flux.zip(flux1, flux2, flux3)
                .subscribe(x -> System.out.println(x.toString()));*/
    }

    public void zipWith(){
       /* List<Afiliado> afiliados1 = new ArrayList<>();
        afiliados1.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados1.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados1.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados1.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        List<Afiliado> afiliados2 = new ArrayList<>();
        afiliados2.add(new Afiliado(5, "Rocio", "Salas",  "51111111", 70000.0));
        afiliados2.add(new Afiliado(6, "Andres", "Ames",  "45523344", 60000.0));
        afiliados2.add(new Afiliado(7, "Pablo", "Robles",  "41224455", 20000.0));
        afiliados2.add(new Afiliado(8, "Julio", "Torres",  "51223344", 80000.0));

        List<Afp> afps = new ArrayList<>();
        afps.add(new Afp(1, "Integra"));
        afps.add(new Afp(2, "Prima"));

        Flux<Afiliado> flux1 = Flux.fromIterable(afiliados1);
        Flux<Afiliado> flux2 = Flux.fromIterable(afiliados2);
        Flux<Afp> flux3  = Flux.fromIterable(afps);

        flux1.zipWith(flux2, (p1, p2) -> String.format("Flux1: %s, Flux2: %s", p1, p2))
                .subscribe(x -> System.out.println(x.toString()));*/
    }
}
