package day25_MethodRecap;

import Resources.Library;

public class test {

    public static void main(String[] args) {

        String str="AAAABBBBCCDDDDDEEE";

        String result= Library.RemoveDuplicates(str);

        System.out.println(result);

        String str1 = "AABBBCDDDEEEEBB";
        String str2 = "B";

        int a = Library.Frequency(str1,str2);

        System.out.println(a);




    }



}
