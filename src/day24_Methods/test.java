package day24_Methods;

import Resources.Library;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

       String str = "Cybertek";


        String Revstr = Library.Reverse(str);

        System.out.println(Revstr);

        int[] arr = {12,34,56,78,90};
        arr = Library.sortDesending(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
