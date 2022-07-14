package pe.com.nttdata.service.imp;


import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.Headline;
import pe.com.nttdata.repository.HeadlineRepository;
import pe.com.nttdata.service.inf.HeadlineService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeadlineServiceImpl implements HeadlineService {

    @Autowired
    HeadlineRepository headlineRepository;





    @Override
    public Flux<Headline> findAll() {

        return headlineRepository.findAll();
    }




    @Override
    public Mono<Void> delete(Headline entity) {
        return headlineRepository.delete(entity);
    }

    @Override
    public Flux<Headline> findbyId(String idTitular) {
        return null;
    }


    @Override
    public Mono<Headline> save(Headline persona) {

        return headlineRepository.save(persona);
    }

    @Override
    public Mono<Headline> update(Headline persona) {
        return null;
    }

    @Override
    public Flux<Headline> findPersonById(String id) {
        return null;
    }


    public Flux<Headline> buscarporId(String idTitular){
        return headlineRepository.buscarporIdTitular(idTitular);
    }


}
