package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_Dimensional {

    public static void main(String[] args) {

        int[][] arr2d={{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(arr2d));

        System.out.println(arr2d[0][2]); //3


        int[][][] arr3d= {   { {1,2,3} , {4,5,6} }      ,      { {7,8,9} , {10,11,12,13} }     };

        System.out.println(Arrays.deepToString(arr3d));

        System.out.println(Arrays.deepToString(arr3d[1]));

        System.out.println(Arrays.toString(arr3d[1][0]));

        System.out.println(arr3d[1][0][0]);


    }
}
