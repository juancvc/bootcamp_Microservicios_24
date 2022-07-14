package pe.com.nttdata.model;

import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientType")
@Data
public class ClientType {

    @Id
    @BsonIgnore
    private String idTipoCliente;
    private String codigo;
    private String nombres;
    private String tipoCliente;
}
