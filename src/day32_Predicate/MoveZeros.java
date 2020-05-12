package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {

    /*
    Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1, 0, 2, 0, 3, 0, 4, 0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT decleare  any extra lists
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();//FARKLI YONTEM KULLANDIM HOCA FARKLI KULLANDI. ONUN YONTEMI CANVAS DA

        Integer[] a= {1, 0, 2, 0, 3, 0, 4, 0};
        list.addAll(Arrays.asList(a));
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(a));


        list.retainAll(Arrays.asList(0));  // {0,0,0,0}
        System.out.println(list.size());

        list2.removeAll(Arrays.asList(0)); // {1,2,3,4}


        for (int i = 0; i < list2.size(); i++) {
            list.add(i, list2.get(i));

        }
        System.out.println(list);


    }
}


