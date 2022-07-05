package pe.com.nttdata.model;

import lombok.*;

import java.util.Date;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Afiliado {
    private Integer id;
    private String nombres;
    private String apellidos;
    private String dni;
    private Double aportes;
}
