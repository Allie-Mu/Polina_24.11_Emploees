package org.example;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Anna One", "director", "ao@office.com", 79876543210L, 200_000, 50);
        employees[1] = new Employee("Olga Two", "accountant", "ot@office.com", 79876543212L, 100_000, 60);
        employees[2] = new Employee("Sofia Three", "HR", "st@office.com", 79876543213L, 100_000, 25);
        employees[3] = new Employee("Oleg Four", "manager", "of@office.com", 79876543214L, 80_000, 30);
        employees[4] = new Employee("Vladimir Five", "security", "vf@office.com", 79876543215L, 50_000, 40);

        for (Employee emp : employees) {
            Employee.printInfo(emp);
            System.out.println();
        }
    }
}