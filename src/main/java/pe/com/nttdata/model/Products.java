package pe.com.nttdata.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class Products {

    @Id
    private ObjectId id;
    private String codigo;
    private String nombres;
    private String tipoProducto; // pasivo - activo

}
