package pe.com.nttdata.repository;

import org.springframework.stereotype.Repository;
import pe.com.nttdata.model.Afiliado;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AfiliadoRepositoryImpl implements IAfiliadoRepository{

    @Override
    public Mono<Afiliado> registrar(Afiliado afiliado) {
        System.out.println(afiliado.toString());
        return Mono.just(afiliado);
    }

    @Override
    public Mono<Afiliado> modificar(Afiliado afiliado) {
        System.out.println(afiliado.toString());
        return Mono.just(afiliado);
    }

    @Override
    public Flux<Afiliado> listar() {
        List<Afiliado> afiliados = new ArrayList<>();
        afiliados.add(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
        afiliados.add(new Afiliado(2, "Pedro", "Torres",  "43333333", 10000.0));
        afiliados.add(new Afiliado(3, "Jose", "Lopez",  "42222222", 80000.0));
        afiliados.add(new Afiliado(4, "Raul", "Rosas",  "45555555", 90000.0));

        return Flux.fromIterable(afiliados);
    }

    @Override
    public Mono<Afiliado> listarPorId(Integer id) {
        return Mono.just(new Afiliado(1, "Juan", "Perez",  "44444444", 50000.0));
    }

    @Override
    public Mono<Void> eliminar(Integer id) {
        return Mono.empty();
    }
}
