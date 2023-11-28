package org.example;

class Emploee {

    static String name;
    static String position;
    static String email;
    static int phoneNumber;
    static int salary;
    static int age;

    public Emploee(
            String name,
            String position,
            String email,
            int phoneNumber,
            int salary,
            int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void printInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}

