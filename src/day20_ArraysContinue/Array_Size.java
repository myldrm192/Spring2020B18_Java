package day20_ArraysContinue;

public class Array_Size {

    public static void main(String[] args) {

        int[] arr1={1,2,3};

        int[] arr2=new int[2];  //{0,0} ---> {10,30} 0 ~ 1
        arr2[0]=10;
        arr2[1]=30;
        arr2=new int[3]; // ustekinide resetler 0,0
    }
}
