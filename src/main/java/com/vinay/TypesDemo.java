package com.vinay;

import com.vinay.types.Employee;

public class TypesDemo {
    public static void main(String[] args) {

        Employee defaultInstance = Employee.getDefaultInstance();
        System.out.println(defaultInstance);// default instance does not set any value

        Employee kvin = Employee.newBuilder()
                .setName("kvin").setAge(22).setIsContractor(true).setSalary(1000.98f)
                .build();
        System.out.println(kvin);
        Employee kvin_2 = Employee.newBuilder()
                .setName("kvin").setAge(22).setIsContractor(true).setSalary(1000.98f)
                .build();

        System.out.println("kvin equlas kvin_2: " + kvin.equals(kvin_2));
        System.out.println("kvin == kvin_2: " + (kvin == kvin_2));

    }
}
