package com.geekbrains.HomeWork5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    //Constructor
    public Person(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Имя сотрудника: " + name + " , занимает должность: " + position);
        System.out.println("Почта сотрудника: " + email);
        System.out.println("Телефон сотрудника: " + phoneNumber);
        System.out.println("Заработная плата сотрудника: " + salary);
        System.out.println("Возраст сотрудника: " + age);
    }
}
