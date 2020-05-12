package day17_WhileLoops;

import java.util.Scanner;

public class mydeneme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxnumber = -9999999; //any number

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter " + i + ". " + "number");
            int num = input.nextInt();

            if (num > maxnumber) {

                maxnumber = num;

            }




        }
        System.out.println("Max Number= " + maxnumber);



    }
}
