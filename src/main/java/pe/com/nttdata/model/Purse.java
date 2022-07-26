package pe.com.nttdata.model;

import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "purse")
@Data

public class Purse {

    @Id
    @BsonIgnore
    private String idMonedero;
    private String idCliente /**puede ser cliente o no para tener un monedero**/;
    private String nombresNoCliente;
    private String apellidosNocliente;
    private String tipoDocumento;
    private String nroDocumento;
    private String nroCelular;
    private String imeiCelular;
    private String correo;
    private String tipoCliente;
    private String nroCuentaBancaria;
    private Double saldo;
    private String estado;
}
