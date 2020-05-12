package day17_WhileLoops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i=0;i==0;) {

            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            System.out.println("Math operator");
            String operator = input.next(); //+,-,*,/,%

            if (operator.equals("+")) {
                System.out.println("Addition: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Substraction is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("Multiplication is: " + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 / num2));
            } else if (operator.equals("%")) {
                System.out.println("Remainder is: " + (num1 % num2));
            } else {
                System.out.println("Invalid Operator");
            }
            for (int a=0;a==0;) {


                System.out.println("Do you wanna continue");

                String answer = input.next();

                if (answer.equalsIgnoreCase("yes")) {
                    i = 0;
                    a=1;
                } else if (answer.equalsIgnoreCase("no")) {
                    i=1;
                    break;
                } else {
                    System.out.println("Invalid Answer Again Enter Please");


                }
            }
        }









    }
}
