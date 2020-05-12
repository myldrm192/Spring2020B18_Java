package day24_Methods;

import java.util.Arrays;

public class TasksFromYesterday {

    /*
    AccessModifier Specifier return-Type methodName(Paramter){
		}
    4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */

    public static void MaxNumber(int[] array){
        Arrays.sort(array);
        System.out.println(array[array.length-1] );
    }

    public static void MinNumber(int[] array){
        Arrays.sort(array);
        System.out.println(array[0]);
    }

    public static void Descending(int[] array){ // {100, 200, -100};

        Arrays.sort(array);

        for(int i = array.length-1; i>=0; i-- ){
            System.out.print(array[i] +" ");
        }
        // 3 2 1
        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {10, 2, 8, 4, 6, 9, 3, 5};
        MaxNumber(arr);
        MinNumber(arr);
        Descending(arr);

    }

    }
