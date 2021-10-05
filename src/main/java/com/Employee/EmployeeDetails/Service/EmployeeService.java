package com.Employee.EmployeeDetails.Service;

import com.Employee.EmployeeDetails.Model.Employee;
import com.Employee.EmployeeDetails.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;


    public List<Employee> getall(){
        return employeeRepo.findAll();
    }
    public Employee addFile(Employee employee){
        return employeeRepo.save(employee);
    }
    public Optional<Employee> find(Long id){
        return employeeRepo.findById(id);
    }
    public void delete(Long id){
        employeeRepo.deleteById(id);
    }
}
