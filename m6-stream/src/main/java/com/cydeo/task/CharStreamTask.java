package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream()
                .map(str-> str.length())
                .forEach(System.out::println);
    }
}
//Given a list of words, print the number of characters for each word.