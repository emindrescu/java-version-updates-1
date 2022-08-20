package com.cydeo.animalTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();
        //Older Approach

        List<Animal> predators = new ArrayList<>();
        for (Animal animal : animals) {  //checking for predators
            if (animal.getClassification().equals(Classification.PREDATOR)) { //if predator, adding to a collection
                predators.add(animal);
            }
        }
        predators.forEach(System.out::println);

        System.out.println("-------------USING STREAM------------");

        //New approach:
        List <Animal> predator = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());     //If predator, add to a collection
        predator.forEach(System.out::println);
        System.out.println("-------------------------------------");
        // How sorting works:
        List<Animal> sorted =animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))  //Sorting by age (ascending)
                .collect(Collectors.toList());  //Adding to a collection
        sorted.forEach(System.out::println);
        System.out.println("---------------------------");

        Optional< String> oldestPredatorAge =animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR)) //Getting the oldest predator
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        oldestPredatorAge.ifPresent(System.out::println);


    }
        private static List<Animal> getAnimals(){
            return List.of(
                    new Animal("Elephant", 20, Classification.HERBIVORE),
                    new Animal("Lion", 4, Classification.PREDATOR),
                    new Animal("Hyena", 2, Classification.PREDATOR),
                    new Animal("Giraffe", 7, Classification.HERBIVORE),
                    new Animal("Zebra", 8, Classification.HERBIVORE),
                    new Animal("Horse", 9, Classification.HERBIVORE),
                    new Animal("Bobcat", 7, Classification.PREDATOR),
                    new Animal("Dinosaur", 100, Classification.PREDATOR)
            );
        }
    }

