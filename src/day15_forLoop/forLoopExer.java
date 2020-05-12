package day15_forLoop;

import java.util.Scanner;

public class forLoopExer {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String inp=input.nextLine();

        int lastindexnumber=inp.length()-1;
        String result="";

        for (int i=lastindexnumber;i>=0;i--){
             result+=inp.charAt(i);


        }
        System.out.println(result);






    }
}
