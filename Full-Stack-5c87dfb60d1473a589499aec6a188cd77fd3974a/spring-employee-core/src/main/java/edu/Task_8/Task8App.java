package edu.Task_8;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Task8App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BeanFactory factory = context;

        EmployeeService service = factory.getBean(EmployeeService.class);

        service.addEmployee(101, "Anand", "CSE");
        service.addEmployee(102, "Divya", "ECE");
        service.addEmployee(103, "Ravi", "IT");

        System.out.println("All Employees:");
        service.getAllEmployees().forEach(System.out::println);

        context.close();
    }
}