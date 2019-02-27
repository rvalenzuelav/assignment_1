package cl.rvalenzuelav.assignment.model;

import cl.rvalenzuelav.assignment.model.enumerations.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {

    @Id
    private String id;

    private @NonNull String name;

    private @NonNull String lastname;

    private String designation;

    private String project;

    private Date joiningDate;

    private boolean status;
}
