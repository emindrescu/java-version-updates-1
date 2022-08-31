package com.cydeo.java13;

public class TextBlockDemo {
    public static void main(String[] args) {
        var address = "7925 Jones Branch Drive \n " +
                "McLean, VA 22102";
        System.out.println(address);

        var address2= """
              7925 Jones Branch Dr
              McLean, VA 22102
              """;
        System.out.println(address2);
    }
}
