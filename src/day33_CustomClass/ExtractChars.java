package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars {

    /*
    3. write a program that can extract the sepecial characters, digits and letters from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA
     */

    public static void main(String[] args) {

        String  str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        /*Character[] a = new Character[arr.length];
        for (int i=1; i<arr.length; i++ )
           a[i]=arr[i];

         */

       // ArrayList<Character> b = new ArrayList<Character>(Arrays.asList(a));

        ArrayList<Character> letters = new ArrayList<>();  // isLetter()
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for(char each : arr ){
            if( Character.isLetter(each) ){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }

        }


        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);





    }
}
