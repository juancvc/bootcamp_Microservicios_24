package pe.com.nttdata.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.DetailProduct;
import pe.com.nttdata.repository.DetailProductRepository;
import pe.com.nttdata.service.inf.DetailProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DetailProductServiceImpl implements DetailProductService {

    @Autowired
    DetailProductRepository detalleProductoRepository;

    @Override
    public Flux<DetailProduct> findAll() {

        return detalleProductoRepository.findAll();
    }

    @Override
    public Mono<DetailProduct> save(DetailProduct detalleProducto) {

        return detalleProductoRepository.save(detalleProducto);
    }

    @Override
    public Mono<DetailProduct> update(DetailProduct detalleProducto) {

        return null;
    }

    @Override
    public Flux<DetailProduct> findPersonById(String idDetalleProducto) {
        return detalleProductoRepository.findAll().filter(x->x.getIdDetalleProducto().equals(idDetalleProducto));
    }

    @Override
    public Mono<Void> eliminar(DetailProduct detalleProducto){

        return detalleProductoRepository.delete(detalleProducto);
    }

    public Flux<DetailProduct> buscarporId(String idDetalleProducto){

        return detalleProductoRepository.buscarporIdDetalleProducto(idDetalleProducto);
    }
}
