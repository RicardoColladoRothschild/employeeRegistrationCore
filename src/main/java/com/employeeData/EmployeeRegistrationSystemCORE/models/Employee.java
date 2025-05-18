package com.employeeData.EmployeeRegistrationSystemCORE.models;


import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String lastName;
    private String email;
    private String password;

        public Employee(){}
        public Employee(String name, String ln, String email, String password){
            this.name = name;
            this.lastName = ln;
            this.email = email;
            this.password = password;
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


        @Override
        public String toString(){
        return "Employee name: " + this.name + "| LastName: " + this.lastName + "| email: " + this.email;
        }
}
