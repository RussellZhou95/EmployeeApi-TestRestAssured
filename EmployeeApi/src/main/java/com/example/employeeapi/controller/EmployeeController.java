package com.example.employeeapi.controller;


import com.example.employeeapi.entity.Employee;
import com.example.employeeapi.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/employeeApi")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employee")
    public List<Employee> get() {
        log.info("Get all the employees");
        return employeeService.getEmployees();
    }

    @GetMapping
    public Employee getById(@RequestParam long id){
        log.info("Get one specific employee");
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public void create(@RequestBody Employee employee){
        log.info("Employee was created");
        employeeService.create(employee);


    }

    @PutMapping
    public void update(@RequestBody Employee employee){
        log.info("Employee was updated");
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        employeeService.deleteById(id);
    }

}
