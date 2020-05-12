package day24_Methods;

public class BirthYear {

    public static void Age(short birthYear ){

        int currentyear = 2020;
        int age = currentyear - birthYear;
        System.out.println(age);

    }

    public static void main(String[] args) {

        int a=2002;
        Age((short)a);
        printhellocybertek();
    }

    public static void printhello(){
        System.out.println("Hello");
    }
    public static void printcybertek() {
        System.out.println("Cybertek");
    }
    public static void printhellocybertek(){
        printhello();
        printcybertek();
    }


















}
