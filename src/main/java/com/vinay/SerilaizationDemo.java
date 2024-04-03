package com.vinay;

import com.vinay.types.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerilaizationDemo {
    public static void main(String[] args) throws IOException {
        var employee = Employee.newBuilder().setSalary(1000.0f).setName("Axal Denial").setAge(21).setIsContractor(true).build();
        employee.writeTo(Files.newOutputStream(Path.of("employee")));
    }
}
