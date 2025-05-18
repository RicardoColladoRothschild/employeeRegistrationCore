package com.employeeData.EmployeeRegistrationSystemCORE.services;


import com.employeeData.EmployeeRegistrationSystemCORE.contracts.EmployeeRegistrationable;
import com.employeeData.EmployeeRegistrationSystemCORE.models.Employee;
import com.employeeData.EmployeeRegistrationSystemCORE.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeRegistrationable {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean registerEmployee(Employee e) {
        try{
            System.out.println("Start registrating a new employee...");
            repository.save(e);
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
}
