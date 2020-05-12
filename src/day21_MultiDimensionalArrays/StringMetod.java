package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMetod {

    public static void main(String[] args) {

        String str = "I like Java";

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        String[] arr2 = str.split(""); // String olarak ayirir

        System.out.println(Arrays.toString(arr2));

        char[] ch2=str.toCharArray(); // char olarak ayirir

        System.out.println(Arrays.toString(ch2));


    }
}
