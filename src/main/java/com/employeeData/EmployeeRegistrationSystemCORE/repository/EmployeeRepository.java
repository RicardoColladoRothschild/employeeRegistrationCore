package com.employeeData.EmployeeRegistrationSystemCORE.repository;

import com.employeeData.EmployeeRegistrationSystemCORE.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Employee findByEmail(String email);
}
