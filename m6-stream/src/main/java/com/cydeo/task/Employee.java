package com.cydeo.task;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Stream;
@Data
@AllArgsConstructor

public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumbers;
}
