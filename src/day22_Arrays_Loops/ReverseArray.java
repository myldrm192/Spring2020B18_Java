package day22_Arrays_Loops;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        /*for (int i=arr.length-1;i>=0; i--){

            System.out.print(arr[i]);
        }

         */

        int[] RevArr = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            RevArr[i] = arr[arr.length-1-i];
        }


        System.out.println(Arrays.toString(RevArr));



    }
}
