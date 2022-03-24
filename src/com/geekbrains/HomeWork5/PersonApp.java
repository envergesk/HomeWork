package com.geekbrains.HomeWork5;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", "tech", "bob@mail.ru", "89161231112", 30000, 35);
        person1.printInfo();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Robert", "manager", "manager@tech.com", "89161231113", 25000, 22);
        persArray[1] = new Person("Margaret", "accountant", "buh@tech.com", "89161231114", 41000, 42);
        persArray[2] = new Person("Jack", "plumber", "santech@tech.com", "89161231115", 26000, 54);
        persArray[3] = new Person("Sally", "Director", "dir@tech.com", "89161231116", 70000, 58);
        persArray[4] = person1;

        for (Person person : persArray){
            if (person.getAge() > 40){
                person.printInfo();
                System.out.println();
            }
        }
        }
    }

