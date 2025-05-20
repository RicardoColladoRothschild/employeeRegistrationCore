package com.employeeData.EmployeeRegistrationSystemCORE.controllers;


import com.employeeData.EmployeeRegistrationSystemCORE.ErrorHandler.exceptions.EmployeeAlreadyExistException;
import com.employeeData.EmployeeRegistrationSystemCORE.models.Employee;
import com.employeeData.EmployeeRegistrationSystemCORE.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Employee employee){
        try {
            service.registerEmployee(employee);
            return ResponseEntity.ok("Employee Registered");
        } catch (EmployeeAlreadyExistException ex) {
            System.out.println("[X] Controller Level - Employee already exist");
            return ResponseEntity.status(409).body(ex.getMessage());
        }
    }
}
