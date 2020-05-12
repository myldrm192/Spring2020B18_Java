package day16_ForLoop;

public class OddNumberDivision {

        public static void main(String[] args) {

        String result3="";
        String result5="";
            System.out.println("division 3");

        for (int i=1;i<=100;i++) {
            if (i % 3 == 0) {

                System.out.print(i+" ");
            }
        }System.out.println(" ");
        System.out.println("division 5");
        for (int i=1;i<=100;i+=2) {
            if (i % 5 == 0) {

                System.out.print(i + " ");
            }
        }




            //System.out.println("division 5");






    }
}
