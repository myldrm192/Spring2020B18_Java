package day17_WhileLoops;

import com.sun.tools.javac.code.Attribute;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxnumber = -9999999; //any number

        int minnumber = 99999;


        for (int i=1; i<6;i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num>maxnumber){

                maxnumber = num;

            }

            if (num<minnumber){

                minnumber=num;
            }



        }

        System.out.println("Max Number= "+maxnumber);
        System.out.println("Min number= "+minnumber);



    }
}
