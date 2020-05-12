package day26_MethodOverLoading;

public class MethodOverloading {

    public static void main(String[] args) {
        method(10);
        method(10.0);
    }

    public static void method(int a) {
        System.out.println("Origanal method");
    }

    public static void method(double b) {
        System.out.println("Overloaded method");
    }
}
