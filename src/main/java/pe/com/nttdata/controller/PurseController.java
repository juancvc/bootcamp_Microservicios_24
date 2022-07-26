package pe.com.nttdata.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.kafka.producer.KafkaStringProducer;

import pe.com.nttdata.model.Purse;
import pe.com.nttdata.service.inf.PurseService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;

@Slf4j
@RestController
@RequestMapping("/api/purse")
public class PurseController {
    private final KafkaStringProducer kafkaStringProducer;


    @Autowired
    private PurseService purseService;


    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    public PurseController(KafkaStringProducer kafkaStringProducer) {
        this.kafkaStringProducer = kafkaStringProducer;
    }

    @PostMapping(value = "/sendMoneyToKafkaTopic")
    public Mono<Purse>  sendMoneyToKafkaTopic(@RequestBody Purse purse,
                                               @RequestParam("monto") Double monto
                                      ) {
         String montoString;
        montoString= String.valueOf(monto);
        this.kafkaStringProducer.sendMessage(montoString);

        return purseService.receiveMoney(purse);

    }

    @PostMapping(value = "/receivedMoneyToKafkaTopic")
    public Mono<Purse>  receivedMoneyToKafkaTopic(@RequestBody Purse purse,
                                          @RequestParam("monto") Double monto) {
        String montoString;
        montoString= String.valueOf(monto);
        this.kafkaStringProducer.sendMessage(montoString);



        return purseService.receiveMoney(purse);

    }


    @PutMapping(value = "/receivedMoney")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Purse> receiveMoney(@RequestBody Purse purse) {
        return purseService.receiveMoney(purse);


    }

    @PutMapping(value = "/sendMoney")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Purse> sendMoney(@RequestBody Purse purse) {
        return purseService.sendMoney(purse);


    }





    @GetMapping("/listado")
    public Flux<Purse> listar(){
        return purseService.findAll();
    }


    @GetMapping("/checkBalance")
    public Mono<Purse>  checkBalance(@RequestParam ("id") String id){
        return purseService.checkBalance(id);
    }




    @PostMapping("/nuevo")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Purse> createPurse(@RequestBody Purse product){
        LOGGER.info("Hizo la peticion de nuevo");

        return purseService.save(product);
    }







}
