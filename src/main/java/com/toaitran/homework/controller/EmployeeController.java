package com.toaitran.homework.controller;

import com.toaitran.homework.exception.EmployeeException;
import com.toaitran.homework.model.Employee;
import com.toaitran.homework.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.RuntimeErrorException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("")
    public List<Employee> getAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Employee get1(@PathVariable Long id){

        return service.findById(id).orElseThrow(()-> new EmployeeException(id));
    }

    @PostMapping
    public void insert(@RequestBody Employee emp)
    {
        service.save(emp);
    }
    @PutMapping
    public void update(@RequestBody Employee emp)
    {
        service.save(emp);
    }
    @DeleteMapping
    public void delete(@RequestBody Employee emp)
    {
        service.delete(emp);
    }
}
