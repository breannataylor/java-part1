package com.hr.personnel;

import java.time.LocalDate;

public class ExecutiveEmployee extends SalariedEmployee {

    public ExecutiveEmployee() {
        // super(); is called here, even though you don't see it.
    }

    public ExecutiveEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public ExecutiveEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " enjoying a round of golf.");
    }

    public void fileReturn() {
        System.out.println("Return filed electronically.");
    }
}