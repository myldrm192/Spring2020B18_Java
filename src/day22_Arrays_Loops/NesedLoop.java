package day22_Arrays_Loops;

public class NesedLoop {

    public static void main(String[] args) {

        char[][] arr2D = { {'A','B'} , {'C','D','E'} , {'F','J','H','I'} };

        /*for (int i=0; i<arr2D.length;i++) {
            System.out.println(arr2D[0][i]);
        }

         */

        for (int j=0; j<arr2D.length;j++){

            for (int i=0; i<arr2D[j].length;i++){
                System.out.println(arr2D[j][i]);

            }
        }





    }
}
