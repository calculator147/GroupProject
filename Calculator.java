package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        int choice, sum = 0, i = 0, difference = 0;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fancy Calculator");
        System.out.println("Please choose your operation: ");
        System.out.println("1 for Addition" + '\n' + "2 for Subtraction");
        System.out.println("3 for Multiplication" + '\n' + "4 for Division" + '\n' + "5 for calculating average");
        choice = input.nextInt();

        //Addition and Subtraction program
        if (choice == 1) {
            System.out.println("You have selected Addition");
            System.out.println("Enter numbers to add (select enter after each one) to add all numbers, enter 0: ");
            int number;
            do {
                number = input.nextInt();
                sum += number;
            }
            while (number != 0);
            System.out.println("Sum of all numbers is = " + sum);

        } else if (choice == 2) {
            System.out.println("You have selected Subtraction. You will subtract 2 numbers");
            System.out.println("Enter first number: ");
            int subnum1 = input.nextInt();
            System.out.println("Enter second number: ");
            int subnum2 = input.nextInt();

            System.out.println("Difference of " + subnum1 + " and " + subnum2 + " is = " + (subnum1 - subnum2));

        } else if (choice == 3) {
            System.out.println("You have selected Multiplication. ");
            System.out.println("Enter number 1: ");
            double multnum1 = input.nextDouble();
            System.out.println("Enter number 2: ");
            double multnum2 = input.nextDouble();
            System.out.println(multnum1 + " times " + multnum2 + " = " + CalcMultiplication.multiplication(multnum1, multnum2));

        } else if (choice == 4) {
            System.out.println("You have selected Division. ");
            System.out.println("Enter number 1: ");
            double divnum1 = input.nextDouble();
            System.out.println("Enter number 2: ");
            double divnum2 = input.nextDouble();
            System.out.println(divnum1 + " divided by " + divnum2 + " = " + CalcDivision.division(divnum1, divnum2));
        }   else if (choice == 5) {
            Scanner sc = new Scanner(System.in);
            System.out.println("You have selected calculating an average");
            System.out.println("Enter number of values you want to average: ");
            int n = sc.nextInt();
            int sum1 = 0;

            int[] numbers = new int[n];

            for(int k=0; k < numbers.length ; k++)
            {
                System.out.println("Enter grade " + (k + 1) + " :");
                int a = sc.nextInt();
                sum1 = sum1 + a;
            }

            double average = sum1 / (double) n;

            System.out.println("Average value of array elements is : " + average);
            sc.close();

        }
    }

}
