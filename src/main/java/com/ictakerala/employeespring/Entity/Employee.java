package com.ictakerala.employeespring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "EMP")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name ="ID")
    @GeneratedValue
    private long id;

    //id (Long)
    //name (String)
    //department (String)
    //salary (Double)
    @Column(name ="NAME")
    private String name;

    @Column(name ="DEPT")
    private  String department;

    @Column(name ="SAL")
    private  Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
