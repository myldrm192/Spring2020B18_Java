package day24_Methods;

public class ReturnMethod {

    public static void maxNumber(int a, int b) {

        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
    public static int Addition(int a, int b) {

        return a+b;

    }




    public static void main (String[]args) {
        maxNumber(10, 20);



int ax=Addition(1,2);
        System.out.println(ax);

    }




}
