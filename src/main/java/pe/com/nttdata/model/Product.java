package pe.com.nttdata.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Product")
@Data
@NoArgsConstructor
public class Product {
    @Id
    private String idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private TypeProduct idTipoProducto;
    private String estado;
}
