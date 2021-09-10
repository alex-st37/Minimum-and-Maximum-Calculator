package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int count = 1;
        int firstNumber = 0;
        int secondNumber;

        while (true){
            System.out.println("Enter a number:");

            boolean isNotANumber = scanner.hasNextInt();
            if (isNotANumber){
                int enteredNumber = scanner.nextInt();

                if (count == 1){
                    firstNumber = enteredNumber;
                    System.out.println("At this time we don't have two numbers to compare.");

                }else if (count == 2) {

                    secondNumber = enteredNumber;

                    if (secondNumber > firstNumber) {
                        max = secondNumber;
                        min = firstNumber;
                        System.out.println("Maximum number is " + max + " and" +
                                " minimum number is " + min);

                    } else if(secondNumber < firstNumber) {
                        max = firstNumber;
                        min = secondNumber;
                        System.out.println("Maximum number is " + max + " and" +
                                " minimum number is " + min);

                    }else{
                        count = 1;
                        System.out.println("The numbers are equal.");
                    }


                }else if (enteredNumber>max) {

                    max = enteredNumber;
                    System.out.println("Maximum number is " + enteredNumber +
                            " and minimum number is " + min);

                }else if (enteredNumber<min){
                    min = enteredNumber;
                    System.out.println("Maximum number is " + max +
                            " and minimum number is " + enteredNumber);

                }else{
                    System.out.println("Maximum number is " + max +
                            " and minimum number is " + min);
                }

                count ++;

            }else{
                System.out.println("Maximum number is " + max + " and minimum number is " + min);
                break;
            }
        }

        scanner.close();
    }
}
