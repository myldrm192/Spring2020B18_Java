package day25_MethodRecap;

public class Frequecy {

    public static void main(String[] args) {

        String str1 = "javajavajavajavajava";
        String str2 = "java";

        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");

        }

        System.out.println(str1);
        System.out.println(count);

        String a = "pyton pyton pyton pyton";
        String b = "pyton";
        int result = Frequency(a,b);

        System.out.println(result);

    }

    public static int Frequency (String str1,String str2){
        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");

        }

        return count;

    }


}
