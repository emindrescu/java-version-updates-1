package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

       Calculate sum = (x, y) -> System.out.println(x+y);
       Calculate s1= (x, y) ->Calculator.findSum(x,y);


        //Reference to Static Method
       Calculate s2=Calculator::findSum;
       s2.calculate(10,20);

       //Reference to an instance method
       Calculator obj =new Calculator();
       Calculate s3 = obj :: findMultiply;
        Calculate s4= new Calculator() :: findMultiply;

        BiFunction <String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction <String, Integer, String> func2 = String::substring;
        Function<Integer, Double> b= new MyClass():: method;
        BiFunction <MyClass, Integer, Double> b1=MyClass::method;

        Consumer <Integer> display = i-> System.out.println(i);
        Consumer <Integer> display2= System.out::println;





    }
}
