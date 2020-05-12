package day02_Variables;

public class Variables {

    public static void main(String[] args) {

        byte l=4;
        byte w=2;
        byte area=8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);


        // byte num1 = 130;  exceed the range of byte
        // byte num = 2.5; byte,short,int,long they only accept whole numbers

        short num3 = 1000;

        System.out.println(num3);

        System.out.println(12345); // by default compiler takes it as int primitive

        int n1 = 2000;
        int n2 = 1000000000;
        System.out.println(n2);

        // int n3 = 9999999999999; exceed range for int

        // long n4 = 9999 999999; //out of int range . compiler by default takes it as int

        long n5 = 9999999999L ;   // forcefully telling the compiler that this is long data number, not int
        System.out.println(n5);

        // int num = 7L; larger one cannot be assigned to smaller one

        short  s1 = 10;
        // byte b1 = s1; short is larger than byte
        int i1 = s1;

        System.out.println(3.5);
        double d1 = 3.5;

        float f1 = 4.5f;
        System.out.println(f1);

        double pi = 3.14f;

        System.out.println(pi);

        long l2 = 40;
        float f3 = l2;
        System.out.println(f3);















    }



}
