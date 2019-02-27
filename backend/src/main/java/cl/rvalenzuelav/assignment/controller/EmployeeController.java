package cl.rvalenzuelav.assignment.controller;

import cl.rvalenzuelav.assignment.model.Employee;
import cl.rvalenzuelav.assignment.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class EmployeeController {

    private static Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employee-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Employee> coolCars() {
        LOGGER.info("Getting employees list..");
        return new ArrayList<>(repository.findAll());
    }


}
