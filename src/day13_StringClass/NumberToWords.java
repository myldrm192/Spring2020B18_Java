package day13_StringClass;

import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 ~ 5 ");
        int num = input.nextByte();
        String result="";

        switch (num){
            case 0: result = "Zero";
                break;
            case 1: result = "one";
                break;
            case 3: result = "Three";
                break;
            case 4: result = "four";
                break;
            case 5: result = "Five";
                break;
            default: result = "Invalid";
        }
        System.out.println(result);

        int num2 = input.nextByte();
        String result2 = (num2==0)? "Zero" :(num2==1)? ("one"):(num2==3)? "three":(num2==4)? "four":(num2==5)? "five" :"invalid";

        System.out.println(result2);









    }
}
