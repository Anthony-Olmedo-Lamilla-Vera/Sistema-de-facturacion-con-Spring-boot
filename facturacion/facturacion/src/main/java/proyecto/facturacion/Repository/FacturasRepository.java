package proyecto.facturacion.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import proyecto.facturacion.DTO.FacturasDTO;

//Remove @RepositoryRestResource below to disable auto REST api:
@RepositoryRestResource
public interface FacturasRepository extends CrudRepository<FacturasDTO, Long> {
}
