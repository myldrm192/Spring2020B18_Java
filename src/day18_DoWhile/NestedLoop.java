package day18_DoWhile;

public class NestedLoop {

    public static void main(String[] args) {

        for (int j=1; j<=10; j++) {

            for (int i = 1; i <= 5; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("================================");

        for (int a=1; a<=7; a++) {
            for (int b = 1; b <= 50; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
