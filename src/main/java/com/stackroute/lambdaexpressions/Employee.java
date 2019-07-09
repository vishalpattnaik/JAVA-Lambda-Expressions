package com.stackroute.lambdaexpressions;

public class Employee {

    String name;
    int age;
    String lastName;

    Employee(String name, int age, String lastName) {

        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
