package com.company;

public class Test {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
        Employee myemployee = new Employee("lily");
        myemployee.age = 10;
        System.out.println(myemployee.age);
        System.out.println(myemployee.getName());
        myemployee.setName("liming");
        System.out.println(myemployee.getName());
        Employee.weight = 20;
        System.out.println("Employee.weight is :" + Employee.weight);

//        Integer i = new Integer(3);
        Integer i = 300000;
        System.out.println(i);
//        int j = i.byteValue();
        int j = i.intValue();
        System.out.println(j);
//        Character a = new Character('a');
        Character a = 'a';
        System.out.println(a.toString());
        System.out.println("欢迎\"光临\"");
    }
}