package pe.com.nttdata.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.TypeProduct;
import pe.com.nttdata.repository.TypeProductRepository;
import pe.com.nttdata.service.inf.TypeProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TypeProductServiceImpl implements TypeProductService {
    @Autowired
    TypeProductRepository tipoProductoRepository;

    @Override
    public Flux<TypeProduct> findAll() {

        return tipoProductoRepository.findAll();
    }

    @Override
    public Mono<TypeProduct> save(TypeProduct tipoProducto) {

        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public Mono<TypeProduct> update(TypeProduct tipoProducto) {

        return null;
    }

    @Override
    public Flux<TypeProduct> findPersonById(String idTipoProducto) {
        return tipoProductoRepository.findAll().filter(x->x.getIdTipoProducto().equals(idTipoProducto));
    }

    @Override
    public Mono<Void> eliminar(TypeProduct tipoProducto){

        return tipoProductoRepository.delete(tipoProducto);
    }

    public Flux<TypeProduct> buscarporId(String idTipoProducto){

        return tipoProductoRepository.buscarporIdTipoProducto(idTipoProducto);
    }
}
