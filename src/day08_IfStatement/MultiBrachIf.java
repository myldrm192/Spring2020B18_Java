package day08_IfStatement;

public class MultiBrachIf {
    public static void main(String[] args) {

        double note= 85;

        boolean a= note>=90 && note<=100;
        boolean b=note>=80;
        boolean c=note>=60;



        if (a) {
            System.out.println("A");
        }
        else if (b){
                System.out.println("B");

        }
    }


}
