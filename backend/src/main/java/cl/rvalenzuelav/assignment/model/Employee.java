package cl.rvalenzuelav.assignment.model;

import cl.rvalenzuelav.assignment.model.enumerations.Status;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {

    private ObjectId _id;

    private @NonNull String name;

    private @NonNull String lastname;

    private String designation;

    private String project;

    private Date joiningDate;

    private Status status;
}
