package com.vinay;

import com.vinay.sec01.Person;

public class Main {
    public static void main(String[] args) {
        var vinay = Person.newBuilder().setAge(32).setName("Vinay").build();
        System.out.println(vinay);
        com.vinay.sec02.Person john = com.vinay.sec02.Person.newBuilder().setAge(22).setName("John").build();
        System.out.println(john);
    }
}
