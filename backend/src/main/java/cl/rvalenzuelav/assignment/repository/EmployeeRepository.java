package cl.rvalenzuelav.assignment.repository;

import cl.rvalenzuelav.assignment.model.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    Employee findBy_id(ObjectId _id);
}
