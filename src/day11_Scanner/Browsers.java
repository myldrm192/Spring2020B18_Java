package day11_Scanner;
/*

 */

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        String browserName = input.next();

        switch (browserName){
            case "Chrome":
            case "chrome":
                System.out.println("Chrome is opening...");
                break;

            case "Firefox":
                System.out.println("Firefox is opening...");
                break;

            case "Safari":
                System.out.println("Safari is opening...");
                break;

            case "Opera":
                System.out.println("Opera is opening...");
                break;

            default:
                System.out.println("Invalid Browser Name. Please give the right Browser Name");



        }

    }
}
