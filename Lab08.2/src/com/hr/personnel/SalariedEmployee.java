package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //fields
    double salary;

    //constructors
    public SalariedEmployee() {


    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);

    }

    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                "salary=" + getSalary();
    }
}