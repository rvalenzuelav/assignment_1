package cl.rvalenzuelav.assignment;

import cl.rvalenzuelav.assignment.model.Employee;
import cl.rvalenzuelav.assignment.model.Project;
import cl.rvalenzuelav.assignment.model.Designation;
import cl.rvalenzuelav.assignment.model.enumerations.Status;
import cl.rvalenzuelav.assignment.repository.EmployeeRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Date;
import java.util.stream.Stream;

@EnableMongoRepositories(basePackageClasses=EmployeeRepository.class)
@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	/*@Bean
	ApplicationRunner init(EmployeeRepository repository) {
		return args -> {
			Stream.of("Pedro", "Juan", "Diego", "Antonio", "Hernan",
					"Luisa", "Mariana", "Tonka", "Vesta").forEach(name -> {
				Employee employee = new Employee();
				employee.setName(name);

				*//*Designation designation = new Designation();
				designation.setName("DevOps");
				Project project = new Project();
				project.setName("Project XYZ");*//*

				employee.setDesignation("DevOps");
				employee.setJoiningDate(new Date());
				employee.setLastname("Perez");
				employee.setProject("Project XYZ");
				employee.setStatus(Status.ACTIVE);
				repository.save(employee);
			});
			repository.findAll().forEach(System.out::println);
		};
	}*/

}
