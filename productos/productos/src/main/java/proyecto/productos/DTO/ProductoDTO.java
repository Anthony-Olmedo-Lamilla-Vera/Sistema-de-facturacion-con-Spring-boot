package proyecto.productos.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class ProductoDTO {
    @Id
    @GeneratedValue()
    Long id;
    String nombre;
    Double precio;
    Integer stock;

}
