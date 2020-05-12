package day20_ArraysContinue;

import java.util.Arrays;

public class ArrayDesc {

    public static void main(String[] args) {


        int[] arr={10,200,-1,90,200,-25};

        int[] arrdesc= new int[arr.length];
        Arrays.sort(arr);

        int k=0;
        for (int i = arr.length-1; i >= 0;i--){
            arrdesc[k]=arr[i];
            k++;
        }

        System.out.println(Arrays.toString(arrdesc));

    }
}
