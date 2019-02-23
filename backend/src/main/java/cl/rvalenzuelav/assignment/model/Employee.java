package cl.rvalenzuelav.assignment.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String name;
}
