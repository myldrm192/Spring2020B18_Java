package day26_MethodOverLoading;

import Resources.Library;

public class Frequency {

    public static void main(String[] args) {

        String str = "AAA";
        char ch = 'A';

        char[] arr = str.toCharArray(); // [A,A,A]

        int count = 0;
        for (char each : arr) {          //for (i=0; i<str.lenght; i++){ }
            if (each == ch) {
                count++;
            }
        }
        System.out.println(count);

        String str2 = "ABCDDDEEABABAB";
        char ch2 = 'B';
        int count2=frequency(str2,ch2);

        int count3 = Library.Frequency(str2,ch2);
        System.out.println(count3);

    }

    public static int frequency(String str,char ch) {
        char[] arr = str.toCharArray(); // [A,A,A]

        int count = 0;
        for (char each : arr) {          //for (i=0; i<str.lenght; i++){ }
            if (each == ch) {
                count++;
            }


        }

        System.out.println(count);
        return count;
    }
}
