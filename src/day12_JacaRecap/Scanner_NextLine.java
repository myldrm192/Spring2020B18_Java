package day12_JacaRecap;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.next();

        System.out.println(name);

        System.out.println("Enter full name");
        String fullName = input.nextLine();

        System.out.println(fullName);







    }
}
