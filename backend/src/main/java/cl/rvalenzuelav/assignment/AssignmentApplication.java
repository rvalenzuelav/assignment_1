package cl.rvalenzuelav.assignment;

import cl.rvalenzuelav.assignment.model.Employee;
import cl.rvalenzuelav.assignment.repository.EmployeeRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Bean
	ApplicationRunner init(EmployeeRepository repository) {
		return args -> {
			Stream.of("Pedro", "Juan", "Diego", "Antonio", "Hernan",
					"Luisa", "Mariana", "Tonka", "Vesta").forEach(name -> {
				Employee employee = new Employee();
				employee.setName(name);
				repository.save(employee);
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
