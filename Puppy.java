package com.company;

public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("小狗的名字："+ name);
    }

    public void setPuppyAge(int Age){
        puppyAge = Age;
    }

    public int getPuppyAge(){
        System.out.println("小狗的年龄:" + puppyAge);
        return puppyAge;
    }

    public static void main(String []args){
        Puppy mypuppy = new Puppy("Tom");
        mypuppy.setPuppyAge(2);
        mypuppy.getPuppyAge();
        System.out.println(mypuppy.puppyAge);
    }
}
