package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory =new ArrayList<Apple>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

AppleHeavyPredicate abc= new AppleHeavyPredicate();
List <Apple> heavyApple =filterApples(inventory, abc);
        System.out.println(heavyApple);


        List <Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);
        ApplePredicate weightApple = (Apple apple) -> apple.getWeight()>200;
        filterApples(inventory, weightApple);


    }
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);

            }
        }
        return result;
    }
}
