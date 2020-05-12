package day10_SwitchAndScanner;

public class number {

    public static void main(String[] args) {

        int num=10;

        String word = (num==0)? "zero" :(num==1)? "one" :(num==3)? "tree" :(num==4)? "four" :(num==5)? "five"
                :(num==6)? "six" :(num==7)? "seven":(num==8)? "eight" :(num==9)? "nine": "Invalid";

        System.out.println(word);

    }
}
