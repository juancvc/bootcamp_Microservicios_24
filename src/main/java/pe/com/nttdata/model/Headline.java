package pe.com.nttdata.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("headline")
@Data
@NoArgsConstructor
public class Headline {
    @Id
    private String idTitular;
    private String nombresTitular;
    private String apellidosTitular;
    private String dniTitular;
    private int edad;
    private String estado;
}
