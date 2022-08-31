package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
//print all emails
        System.out.println("Print all emails");
        EmployeeData.readAll()
               // .map(Employee:: getEmpEmail)
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print all phone numbers");
        EmployeeData.readAll()
                .flatMap(employee-> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print all phone numbers with Double Colon operator");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers) //it's stream now, let's flat it:
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
