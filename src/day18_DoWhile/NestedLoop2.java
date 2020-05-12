package day18_DoWhile;

public class NestedLoop2 {

    public static void main(String[] args) {
        String result= "";
        String helper= "";
        for (int i=5; i>=1;i-- ){
            for (int k=1; k<=i; k++){

                System.out.print("* ");

            }

            System.out.println();
        }



    }
}
