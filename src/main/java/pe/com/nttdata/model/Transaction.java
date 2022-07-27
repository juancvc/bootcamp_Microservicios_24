package pe.com.nttdata.model;

import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
@Data

public class Transaction {

    @Id
    @BsonIgnore
    private String idTransaccion;
    private String tipo;
    private Double monto;
    private String estado;
}
