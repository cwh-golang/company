package com.company;

public class StringDemo {
    public static void main(String args[]) {
        String site = "www.runoob.com";
        int len = site.length();
        System.out.println( "菜鸟教程网址长度 : " + len );
        String strConcat = site.concat("Hello,world!");
        System.out.println(strConcat);
        strConcat = strConcat + "ahah";
        System.out.println(strConcat);
        System.out.println(strConcat.charAt(5));
        System.out.println(strConcat.compareToIgnoreCase("ahah"));
    }
}