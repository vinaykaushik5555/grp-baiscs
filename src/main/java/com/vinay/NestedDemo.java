package com.vinay;

import com.vinay.composition.Employee;
import com.vinay.composition.Organisation;

import java.util.List;

public class NestedDemo {

    public static void main(String[] args) {

        Employee aman = Employee.newBuilder().setName("aman").setDepartment("IT").build();
        Employee vinay = aman.toBuilder().setName("Vinay").build();


        Organisation kvin_it_labs = Organisation.newBuilder().setName("KVIN IT Labs")
                .addAllEmployees(List.of(aman, vinay)).build();
        System.out.println(kvin_it_labs);
    }

}
