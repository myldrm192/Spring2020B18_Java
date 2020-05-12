package day14_StringClass;

import java.util.Scanner;

public class combineTwoString {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord= input.next();

        System.out.println("Enter second word");
        String secondWord = input.next();



       String result= firstWord.concat(" "+secondWord).concat(" "+secondWord).concat(" "+firstWord);

        System.out.println(result);





    }
}
