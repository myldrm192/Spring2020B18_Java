package day25_MethodRecap;

import Resources.Library;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AABBBCC";
        String NonDup = Library.RemoveDuplicates(str);  //abc

        for (int i=0; i<NonDup.length(); i++) {

            String ch = "" + NonDup.charAt(i);
            int num = Library.Frequency(str, ch);

            System.out.print(ch + num);
        }




    }
}
