package com.cydeo.task;


import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream <Employee> readAll() {
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("2022028765","7038763425")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("4122028765","8998763425")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("5162028765","6198763425"))
        );
    }
}