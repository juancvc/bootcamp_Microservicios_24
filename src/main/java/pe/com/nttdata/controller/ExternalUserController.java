package pe.com.nttdata.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.kafka.producer.KafkaStringProducer;
import pe.com.nttdata.model.ExternalUser;
import pe.com.nttdata.service.inf.ExternalUserService;
import reactor.core.publisher.Mono;
import java.lang.invoke.MethodHandles;

@Slf4j
@RestController
@RequestMapping("/api/externalUser")
public class ExternalUserController {
    private final KafkaStringProducer kafkaStringProducer;


    @Autowired
    private ExternalUserService externalUserService;


    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    public ExternalUserController(KafkaStringProducer kafkaStringProducer) {
        this.kafkaStringProducer = kafkaStringProducer;
    }


    @PostMapping(value = "/validateExistTransaction")
    public Mono<ExternalUser>  validateExistTransaction(@RequestParam("codigoTransaccion") int codigoTransaccion)
    {
        this.kafkaStringProducer.sendMessage("Validar Transaccion");

        return externalUserService.validateExistTransaction(codigoTransaccion);
    }

    @PostMapping("/nuevoUsuarioExterno")
    @ResponseStatus(HttpStatus.OK)
    public Mono<ExternalUser> nuevoUsuarioExterno(@RequestBody ExternalUser product){
        LOGGER.info("Se hizo el registro");
        this.kafkaStringProducer.sendMessage("Se hizo el registro de usuario externo");
        return externalUserService.save(product);
    }







}
