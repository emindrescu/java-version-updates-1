package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {
    public static void main(String[] args) {
        Optional<String>str=Optional.empty();
        System.out.println(str.get());

        if (str.isPresent()){
            System.out.println(str.get());

        }else {
            //exception handling
        }
        System.out.println(str.orElseThrow());
        System.out.println(str.orElseThrow(() -> new RuntimeException()));
    }
}
