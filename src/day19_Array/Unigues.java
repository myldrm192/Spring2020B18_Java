package day19_Array;

public class Unigues {

    public static void main(String[] args) {

        String str = "AABCC";

        String result = "";


        for (int z=0; z<=str.length()-1; z++){

            int count=0;

            for (int i=0; i<=str.length()-1; i++){
                if (str.charAt(i)==str.charAt(z)) {
                    count++;
                }

           }
            if (count==1) {
                result+=str.charAt(z);
            }


        }
        System.out.println(result);







    }


}
