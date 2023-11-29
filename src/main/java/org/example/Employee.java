package org.example;

class Employee {

    String name;
    String position;
    String email;
    long phoneNumber; // int is too small
    int salary;
    int age;

    public Employee(
            String name,
            String position,
            String email,
            long phoneNumber,
            int salary,
            int age    )
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

   public static void printInfo(Employee employee) {
        System.out.println("Name: " + employee.name);
        System.out.println("Position: " + employee.position);
        System.out.println("Email: " + employee.email);
        System.out.println("Phone number: " + employee.phoneNumber);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Age: " + employee.age);
        System.out.println();
   }
}

