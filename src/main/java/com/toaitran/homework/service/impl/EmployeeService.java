package com.toaitran.homework.service.impl;

import com.toaitran.homework.exception.EmployeeException;
import com.toaitran.homework.model.Employee;
import com.toaitran.homework.repository.EmployeeRepository;
import com.toaitran.homework.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService implements BaseService<Employee,Long> {

    @Autowired
    private EmployeeRepository service;

    @Override
    public List<Employee> findAll() {
        return service.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {

        return service.findById(id);
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void insert(Employee employee) {

    }

    @Override
    public void save(Employee employee) {
        service.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        service.delete(employee);
    }
}
