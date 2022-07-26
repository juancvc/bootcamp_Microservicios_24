package pe.com.nttdata.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.nttdata.model.Client;
import pe.com.nttdata.model.DetailProduct;
import pe.com.nttdata.model.Product;
import pe.com.nttdata.repository.DetailProductRepository;
import pe.com.nttdata.repository.ProductRepository;
import pe.com.nttdata.service.inf.DetailProductService;
import pe.com.nttdata.service.inf.ProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {



    @Autowired
    ProductRepository productoRepository;

    @Override
    public Flux<Product> findAll() {

        return productoRepository.findAll();
    }

    @Override
    public Mono<Product> save(Product product) {
        return productoRepository.save(product);
    }

    @Override
    public Mono<Product> update(Product product) {
        return productoRepository.update(product);
    }

    @Override
    public Flux<Product> findProductById(String id) {
        return null;
    }

    @Override
    public Mono<Void> delete(Product product) {
        return productoRepository.delete(product);
    }

    @Override
    public Mono<Product> finfById(String idProduct) {
        return productoRepository.findById(idProduct);
    }

    @Override
    public Mono<Product> validateExistsDebt(Product product) {
        return productoRepository.validateExistsDebt(product);
    }







}
