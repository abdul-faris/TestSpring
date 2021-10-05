package com.Employee.EmployeeDetails.Controll;

import com.Employee.EmployeeDetails.Model.Employee;
import com.Employee.EmployeeDetails.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeControll {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public List<Employee> getall(){
        return service.getall();
    }
    @PostMapping("/add")
    public Employee save(@RequestBody Employee employee){
        return service.addFile(employee);
    }
    @GetMapping("find/{id}")
    public Optional<Employee> find(@PathVariable Long id){
        return service.find(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
