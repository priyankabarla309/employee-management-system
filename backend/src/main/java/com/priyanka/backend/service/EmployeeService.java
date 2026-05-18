package com.priyanka.backend.service;

import com.priyanka.backend.entity.Employee;
import com.priyanka.backend.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee save(Employee e) {
        return repo.save(e);
    }
}
