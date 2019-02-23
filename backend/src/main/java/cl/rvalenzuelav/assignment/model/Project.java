package cl.rvalenzuelav.assignment.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String name;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Employee> employee;

}
