package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee emp = new Employee("BreAnna");
        try {
            emp.goToWork();
        } catch (WorkException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage()); // extract the nested cause
        }



    }
}