package day40_Encapsulation;

public class Quiz_11 {

        public Quiz_11(){
            System.out.print("A ");
        }

        public Quiz_11(int a){ // A C B
            this(2.5); // A C
            System.out.print("B "); // B
        }

        public Quiz_11(double a){  // A C
            this(); //A
            System.out.print("C "); //C
        }


        public static void main(String[] args) {
            Quiz_11 obj = new Quiz_11(100);
        }
}
