package com.cydeo.task;

import java.util.Comparator;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {
        //print all dish's name that has less than 400 cal

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
             //   .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);



        //print the length of the name of each dish
        DishData.getAll().stream()
               .map(Dish::getName)
                .map(String::length )
                .forEach(System.out::println);

        //print 3 high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //print all dish name that are below 400 cal as sorted
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

        Stream<Dish> dishStream = DishData.getAll().stream();



    }
}
