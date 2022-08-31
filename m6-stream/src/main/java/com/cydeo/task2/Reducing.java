package com.cydeo.task2;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

//        int sum = 0;
//        for(int number : numbers){
//            sum = sum + number;
//        }

        int result = numbers.stream().reduce(0,(a,b) -> a+b);

        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(result2.get());


        System.out.println("Dish calories total:");
        Optional<Integer> calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce((a,b) -> a+b)
                .reduce(Integer::sum);

        System.out.println(calTotal.get());

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());

        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);


    }
}