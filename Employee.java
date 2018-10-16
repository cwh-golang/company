package com.company;

//import java.io.*;

public class Employee {
    private String name;
    public int age;
    String designation;
    double salary;
    static int weight;

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 设置age的值
    public void empAge(int empAge) {
        age = empAge;
    }

    /* 设置designation的值*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* 设置salary的值*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* 打印信息 */
    public void printEmployee() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }
}