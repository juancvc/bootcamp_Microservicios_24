package pe.com.nttdata.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("typeProduct")
@Data
@NoArgsConstructor
public class TypeProduct {

    @Id
    private String idTipoProducto;
    private String descripcionProducto;
    private String estado;
}
