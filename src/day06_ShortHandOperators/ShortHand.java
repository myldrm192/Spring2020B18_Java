package day06_ShortHandOperators;

public class ShortHand {

    public static void main(String[] args) {

        // +=;

        int a=9;
        a+=3;
        System.out.println(a); //12

        double b=a+=5;
        System.out.println(b); //17.0

        int c = a+=b;
        System.out.println(c);  // a=17  b=17

        int x=10;
        x-=3;
        System.out.println(x);

        int y=x-=2;
        System.out.println(y);
        System.out.println(x);


        int m=1000;
        m*=m-=1000;
        System.out.println(m);

        System.out.println(true!=false);

        int num123=10;

        System.out.println(num123%=2);













    }
}
