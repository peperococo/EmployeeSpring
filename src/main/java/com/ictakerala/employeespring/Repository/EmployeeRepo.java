package com.ictakerala.employeespring.Repository;

import com.ictakerala.employeespring.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
