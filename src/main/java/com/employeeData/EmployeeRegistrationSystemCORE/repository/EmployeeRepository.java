package com.employeeData.EmployeeRegistrationSystemCORE.repository;

import com.employeeData.EmployeeRegistrationSystemCORE.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
