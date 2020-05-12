package day10_SwitchAndScanner;

import java.util.Scanner;

public class Scanner_Practice {



    public static void main(String[] args) {



    Scanner giris = new Scanner(System.in);

        System.out.println("Enter your first number:  ");
            byte num1 = giris.nextByte();
        System.out.println("Enter your second number:  ");
            byte num2 = giris.nextByte();
        System.out.println("The sum of those two numbers are:  "+ (num1+num2) );







    }

}
