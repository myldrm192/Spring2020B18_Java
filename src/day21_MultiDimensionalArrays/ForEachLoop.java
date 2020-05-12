package day21_MultiDimensionalArrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        for (int eachelement : nums){

            System.out.println(eachelement);
        }


        String[] students = {"Muhtar","Asiya","Murodil"};

        for (String eacStudent : students){
            System.out.println(eacStudent);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9};

        for (int each : arr1){
            if (each<5){
                continue;
            }
            System.out.println(each);
        }

    }
}
