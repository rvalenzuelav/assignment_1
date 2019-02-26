package cl.rvalenzuelav.assignment.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Set;

@Data
@NoArgsConstructor
public class Project {

    private ObjectId _id;
    private @NonNull String name;

    @DBRef
    private Set<Employee> employee;

}
