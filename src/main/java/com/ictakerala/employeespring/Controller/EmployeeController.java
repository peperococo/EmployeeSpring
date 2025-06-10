package com.ictakerala.employeespring.Controller;


import com.ictakerala.employeespring.Entity.Employee;
import com.ictakerala.employeespring.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeservice;

    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeservice.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getDetails()
    {
        return employeeservice.getAllDetails();
    }

    @GetMapping("/employees/{id}")
    public Employee fetchDetailsById(@PathVariable long id){
        return employeeservice.getEmployeeDetailsById(id);
    }

    @PutMapping("/employees")
    public Employee updateEmployeeDetails(@RequestBody Employee employee){
        return employeeservice.updateDetail(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deletefunction(@PathVariable long id){
        return employeeservice.deleteEmployee(id);
    }

}
