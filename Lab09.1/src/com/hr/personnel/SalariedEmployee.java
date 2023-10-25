package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee implements TaxPayer {
    //fields
    double salary;
    private final double SALARY_STANDARD_DEDUCTION = 10_000.00;

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

    //business methods
    @Override
    public void pay() {
        System.out.printf("%s is paid salary %s\n", getName(), getSalary());
    }

    public void takeVacation(){
        System.out.println(getName() + " is on vacation.");
    }

    public void payTaxes() {
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.println(getName() + "paid taxes of " + taxes + ".\n");
    }


    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getStandardDeduction() {
        return SALARY_STANDARD_DEDUCTION;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}