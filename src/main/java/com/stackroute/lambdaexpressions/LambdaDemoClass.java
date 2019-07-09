package com.stackroute.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemoClass {

    public static void main(String[] args){

        Employee ob1 = new Employee("Julianna", 12, "Bentley");
        Employee ob2 = new Employee("Chana", 34, "Williamson");
        Employee ob3 = new Employee("Whitney", 56, "Shaw");
        Employee ob4 = new Employee("Kelsey", 78, "Nielsen");
        Employee ob5 = new Employee("Ashley", 90, "Daniels");

        List<Employee> emp = new ArrayList<>();

        emp.add(ob1);
        emp.add(ob2);
        emp.add(ob3);
        emp.add(ob4);
        emp.add(ob5);

        emp.sort((Employee e1, Employee e2)->e1.getLastName().compareTo(e2.getLastName()));

        emp.forEach((ee)->System.out.println(ee));

        System.out.println("\n");
        emp.stream().filter(e->e.getLastName().startsWith("C")).forEach((e1)->System.out.println(e1));

    }


}
