package com.employeeData.EmployeeRegistrationSystemCORE.controllers;


import com.employeeData.EmployeeRegistrationSystemCORE.models.Employee;
import com.employeeData.EmployeeRegistrationSystemCORE.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String register(@RequestBody Employee employee){
        boolean sucess = service.registerEmployee(employee);
            //TODO: @Ricardo create a "error handling library" that we could passa an error type, as an exception and
            //it return a prepare message
        return "";
    }
}
