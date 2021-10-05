package com.Employee.EmployeeDetails.Repository;

import com.Employee.EmployeeDetails.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
