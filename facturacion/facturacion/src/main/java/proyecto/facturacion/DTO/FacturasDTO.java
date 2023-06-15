package proyecto.facturacion.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "facturas")
@Getter
@Setter
public class FacturasDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    String descripcion;
    Double total;

}
