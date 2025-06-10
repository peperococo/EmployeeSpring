package com.ictakerala.employeespring.Service;

import com.ictakerala.employeespring.Entity.Employee;
import com.ictakerala.employeespring.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee){

        return  employeeRepo.save(employee);

    }

    public List<Employee> getAllDetails()
    {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeDetailsById(long id)
    {
        return employeeRepo.findById(id).orElse(null);
    }

    public Employee updateDetail(Employee employee){

        Employee updateEmployee= employeeRepo.findById(employee.getId()).orElse(null);
        if(updateEmployee!=null)
        {
            updateEmployee.setName(employee.getName());
            updateEmployee.setDepartment(employee.getDepartment());
            updateEmployee.setSalary(employee.getSalary());
            employeeRepo.save(updateEmployee);
            return updateEmployee;
        }
        return null;
    }

    public String deleteEmployee(long id){

            if(employeeRepo.existsById(id)) {
                employeeRepo.deleteById(id);
                return "deleted " + id;
            }
            else{
                return "id is not present";
            }
    }

}
