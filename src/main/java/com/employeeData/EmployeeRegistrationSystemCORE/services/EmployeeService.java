package com.employeeData.EmployeeRegistrationSystemCORE.services;


import com.employeeData.EmployeeRegistrationSystemCORE.ErrorHandler.exceptions.EmployeeAlreadyExistException;
import com.employeeData.EmployeeRegistrationSystemCORE.Interfaces.EmployeeRegistrationable;
import com.employeeData.EmployeeRegistrationSystemCORE.models.Employee;
import com.employeeData.EmployeeRegistrationSystemCORE.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeRegistrationable {

    private final EmployeeRepository repository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public EmployeeService(EmployeeRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean registerEmployee(Employee e) {
        System.out.println("[O] - Start registering a new employee.");

        Optional<Employee> existingEmployee = Optional.ofNullable(repository.findByEmail(e.getEmail()));

        if (existingEmployee.isPresent()) {
            throw new EmployeeAlreadyExistException("Employee already exists with email: " + e.getEmail());
        }

        String hashedPassword = passwordEncoder.encode(e.getPassword());
        e.setPassword(hashedPassword);
        repository.save(e);
        System.out.println("[O] - Employee registered successfully.");
        return true;
    }
}
