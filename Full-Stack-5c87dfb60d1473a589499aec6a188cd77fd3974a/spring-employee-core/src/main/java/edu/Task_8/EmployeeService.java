package edu.Task_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmployeeService {

    private final EmployeeRepository repo;

    @Autowired
    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    // ✅ This method was missing
    public void addEmployee(int id, String name, String dept) {
        repo.save(new Employee(id, name, dept));
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
}