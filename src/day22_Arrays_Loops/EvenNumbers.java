package day22_Arrays_Loops;

import java.util.Arrays;

public class EvenNumbers {

    public static void main(String[] args) {

     int[] numbers = new int[100];



     /*
     numbers[0] = 1;
     numbers[1] = 2;
     numbers[0] = 3;
     */

    for (int i=0; i<100; i++ ) {
         numbers[i] = i + 1;
     }
        System.out.println(Arrays.toString(numbers));





     for (int eachNumbers : numbers){
         if (eachNumbers%2!=0){
             continue;
         }

         System.out.print(eachNumbers+" ");


     }


    }
}
