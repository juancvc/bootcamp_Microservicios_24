package pe.com.nttdata.model;

import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "externalUser")
@Data

public class ExternalUser {

    @Id
    @BsonIgnore
    private String idUsuarioExterno;
    private String idCliente /**puede ser cliente o no para tener un monedero**/;
    private String idMonedero /***el usuario puede tener  un id de aplicativo Yanki**/;
    private String nombresNoCliente;
    private String apellidosNocliente;
    private String tipoDocumento;
    private String nroDocumento;
    private String nroCelular;
    private String imeiCelular;
    private String correo;
    private String tipoCliente;
    private int nroTransaccion;
    private String nroCuentaBancaria /***el usuario puede tener  un una cuenta bancaria para hacer transferencias**/;;
    private Double saldo;
    private String estado;
}
