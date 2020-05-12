package day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = input.next();

        System.out.println("Enter your Last Name: ");
        String lastName = input.next();

        System.out.println("Are you employeed?");
        boolean employeedStatus = input.nextBoolean();

        double salary = 0;
        if (employeedStatus==true){
            System.out.println("Enter your salary: ");
            salary = input.nextDouble();
        }



        String fullName = firstName+ " " + lastName;
        System.out.println("Full name is: "+fullName);
        System.out.println("Your salary: "+salary);



    }
}
