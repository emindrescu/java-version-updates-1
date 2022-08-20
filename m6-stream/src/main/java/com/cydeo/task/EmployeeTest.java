package com.cydeo.task;

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
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
    }
}
