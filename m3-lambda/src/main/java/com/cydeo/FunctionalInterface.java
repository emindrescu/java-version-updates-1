package com.cydeo;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        ApplePredicate ap= new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        System.out.println("*****************PREDICATE*****************");
        Predicate <Integer> lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));

        System.out.println("*********CONSUMER*************");
        Consumer <Integer> display =i -> System.out.println();
        display.accept(10);

    }
}
