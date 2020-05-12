package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("first word");
        String w1=input.next();

        int total=w1.length();
        int middle=total/2;

        String middlech="";

        if (total%2!=0) {
            middlech=middlech+w1.charAt(middle);
        }else{
            middlech=middlech+w1.charAt(middle-1)+ w1.charAt(middle);

        }
        System.out.println(middlech);












    }

}
