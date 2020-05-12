package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class deneme {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.removeIf(a-> a==5);

        System.out.println(list);
    }
}
