package day26_MethodOverLoading;

public class Uniques {

    public static void main(String[] args) {
        String str = "ABB";
       String result = "";  //A

        for (int i=0; i<str.length(); i++) {


            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);

        String str2 = "Cybertek";
        String result2 = uniques(str2);
        System.out.println(result2);

    }

    public static String uniques(String str){
        String result = "";  //A
        for (int i=0; i<str.length(); i++) {


            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int frequency(String str,char ch) {
        char[] arr = str.toCharArray(); // [A,A,A]

        int count = 0;
        for (char each : arr) {          //for (int i=0; i<str.lenght; i++){ }
            if (each == ch) {
                count++;
            }


        }


        return count;
    }

}
