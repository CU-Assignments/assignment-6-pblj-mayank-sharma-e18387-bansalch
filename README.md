[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/lJCmCmFd)
# Assignment-6-PBLJ
# README - Java Lambda & Stream Operations 🚀

## Introduction 📝
This repository contains Java programs demonstrating the power of lambda expressions and stream operations for sorting, filtering, and processing large datasets efficiently.

## Problem Statements ❓

### Easy Level 🌱
**Task:** Write a program to sort a list of Employee objects based on different attributes such as name, age, and salary using lambda expressions.

### Medium Level 🌿
**Task:** Create a program that filters students scoring above 75%, sorts them by marks, and displays their names using lambda expressions and stream operations.

### Hard Level 🌳
**Task:** Write a Java program to process a large dataset of products using streams. Implement the following operations:
- Group products by category.
- Find the most expensive product in each category.
- Calculate the average price of all products.

---

## Sample Employee Class 👨‍💼👩‍💼

```java
class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}
```

---

## Instructions 📌
1. Clone this repository.
2. Implement solutions for each problem.
3. Run and test the code to verify correctness.

Happy Coding! 🎯
