package cl.rvalenzuelav.assignment.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Set;

@Data
@NoArgsConstructor
public class Project {

    @Id
    private String id;
    private @NonNull String name;

    @DBRef
    private Set<Employee> employee;

}
