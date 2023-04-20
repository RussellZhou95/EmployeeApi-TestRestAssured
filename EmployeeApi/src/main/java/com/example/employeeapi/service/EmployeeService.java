package com.example.employeeapi.service;

import com.example.employeeapi.entity.Employee;
import com.example.employeeapi.exception.EmployeeNotFoundException;
import com.example.employeeapi.repo.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getEmployees(){
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(long id){
        if(!employeeRepo.findById(id).isPresent()) {
            throw new EmployeeNotFoundException("Employee with id "+id+" was not found.");
        }
        return employeeRepo.findById(id).get();
    }

    public void create(Employee employee){
        if(employee!=null){
            employeeRepo.save(employee);
        }else{
            log.error("There is no employee to create");
        }
    }

    public void updateEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public void deleteById(int id) {
        employeeRepo.deleteById((long) id);
    }
}
