package pe.com.nttdata.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.Person;
import pe.com.nttdata.repository.IPersonRepository;
import pe.com.nttdata.service.inf.IPesonService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements IPesonService {

    @Autowired
    IPersonRepository personaRepository;

    @Override
    public Flux<Person> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Mono<Person> save(Person persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Mono<Person> update(Person persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Flux<Person> findPersonaByDni(String dni) {
        return personaRepository.findAll().filter(x -> x.getDni().equals(dni));
    }

    @Override
    public Mono<Void> delete(Person persona) {
        return personaRepository.delete(persona);
    }

    @Override
    public Flux<Person> buscarPorDni(String dni) {
        return personaRepository.buscarPorDni(dni);
    }
}
