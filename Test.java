package com.company;

public class Test{
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        Test test = new Test();
        test.pupAge();
        Employee myemployee = new Employee("lily");
        myemployee.age = 10;
        System.out.println(myemployee.age);
        System.out.println(myemployee.getName());
        myemployee.setName("liming");
        System.out.println(myemployee.getName());
    }
}