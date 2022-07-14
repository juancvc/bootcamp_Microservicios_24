package pe.com.nttdata.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("detailProductCliente")
@Data
@NoArgsConstructor
public class DetailProduct {

    @Id
    private String idDetalleProducto;
    private Client idCliente;
    private Product idProducto;
    private String estado;
}
