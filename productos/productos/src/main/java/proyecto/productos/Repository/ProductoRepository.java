package proyecto.productos.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import proyecto.productos.DTO.ProductoDTO;

//Remove @RepositoryRestResource below to disable auto REST api:
@RepositoryRestResource
public interface ProductoRepository extends CrudRepository<ProductoDTO, Long> {
}