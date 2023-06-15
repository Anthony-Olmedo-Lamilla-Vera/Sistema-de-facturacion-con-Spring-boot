package clientes.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import clientes.demo.Dto.ClienteDAO;

//Remove @RepositoryRestResource below to disable auto REST api:
@RepositoryRestResource
public interface ClienteRepository extends CrudRepository<ClienteDAO, Long> {
}