package cl.rvalenzuelav.assignment.repository;

import cl.rvalenzuelav.assignment.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Optional<Employee> findById(String id);
}
