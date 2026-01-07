package com.example.RNRDS.controller;

import com.example.RNRDS.entity.Employee;
import com.example.RNRDS.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // Insert
    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return service.save(employee);
    }

    // Get all
    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    // Get by id
    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
