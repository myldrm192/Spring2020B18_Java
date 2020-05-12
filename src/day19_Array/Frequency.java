package day19_Array;



public class Frequency {

    public static void main(String[] args) {

        String str = "AABCCDDD";
        String nonDup="";
        String result = "";

        for (int k=0; k<=str.length()-1; k++)

            if (!nonDup.contains(""+str.charAt(k))){
                nonDup+=str.charAt(k);
            }

        for (int j = 0; j <= nonDup.length() - 1; j++) {

           char ch= nonDup.charAt(j);
           int count = 0;


            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
                    result += ""+ch+count;








        }
        System.out.println(result);

    }
}














