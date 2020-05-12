package day18_DoWhile;

public class StringReverse {

    public static void main(String[] args) {

        String str="Java";
        String rts="";

        int lastIndex=str.length()-1;
        do {

            rts+=str.charAt(lastIndex);

            lastIndex--;


        }while(lastIndex>=0);
        System.out.println(rts);

    }
}
