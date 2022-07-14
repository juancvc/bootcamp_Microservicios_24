package pe.com.nttdata.model;

import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
@Data
public class Client {

    @Id
    @BsonIgnore
    private ObjectId idCliente;
    private String idPersona;
    private String nombres;
    private String apellidos;
    private String tipoCliente;
    private String nroCuentaBancaria;
    private String estado;
}
