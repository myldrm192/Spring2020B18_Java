package day13_StringClass;

public class String_Literals {

    public static void main(String[] args) {

        String str="Cat";  // String Pool
        String str2 = new String("Cat"); // In JavaHeap

        System.out.println(str+" : "+str2);

        System.out.println(str == str2); // two different object

        String str3 = "Cat";

        System.out.println(str==str3);

        String str4 = new String("Cat");

        System.out.println(str2==str4);









    }
}
