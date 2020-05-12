package day22_Arrays_Loops;

public class NestedLoop_ForEach {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        //   0 1 2 3 4

        for(int each   : arr){
            System.out.println(each);
        }

        System.out.println("============================");

        int[][] arr2D = { {1,2,3}, {4,5,6}  };
        //                   0        1

        for(int[]  each1Darray: arr2D ){

            for( int eachElement  : each1Darray ){

                System.out.println(eachElement);

            }

        }

    }
}
