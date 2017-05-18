package com.company;


public class CalcDivision {
    public static double division(double x, double y) {
        double result;
        if (y == 0) {
            System.out.println("The result is undefinded");
        }
            else {
            System.out.println(x + "divided by" + y + "is" + (x/y));

        }
        result = x / y;
        return result;
    }
}
