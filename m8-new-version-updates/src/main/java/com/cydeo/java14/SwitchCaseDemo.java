package com.cydeo.java14;

public class SwitchCaseDemo {

    public static void main(String[] args) {


        var month = 4;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println("this month has 30 days");
                break;
            case 2:
                System.out.println("February can have 28 or 29 days");
                break;
            default:
                System.out.println("invalid month");
        }
        int day1 = switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9 -> 30;
            case 2 -> 29;
            default -> 0;
        };
    }
}