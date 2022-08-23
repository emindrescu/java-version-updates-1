package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {
        var str= "Mike \n Ozzy \n Tom \n Emma";
        str.lines().forEach(System.out::println);
    }
}
