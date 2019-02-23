package cl.rvalenzuelav.assignment.model;

import cl.rvalenzuelav.assignment.model.enumerations.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String name;

    private @NonNull String lastname;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Designation designation;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private Project project;

    private Date joiningDate;

    @Enumerated
    private Status status;
}
