package pe.com.nttdata.operators;

import pe.com.nttdata.model.Afiliado;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Matematicos {

    public void average(){
        List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .collect(Collectors.averagingDouble(Afiliado::getAportes))
                .subscribe(p -> System.out.println(p.toString()));
    }

    public void count(){
        List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                //.filter(x -> x.getNombres().equals("Juan"))
                .count()
                .subscribe(x -> System.out.println("Cantidad: " + x));
    }

    public void min(){
        List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 100000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .collect(Collectors.minBy(Comparator.comparing(Afiliado::getAportes)))
                .subscribe(p -> System.out.println(p.toString()));
    }

    public void sum(){
        List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 100000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        Flux.fromIterable(afiliados)
                .collect(Collectors.summingDouble(Afiliado::getAportes))
                .subscribe(x -> System.out.println("Cantidad : " + x));
    }

}
