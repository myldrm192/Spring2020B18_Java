package day30_ArrayList;

import java.util.ArrayList;

public class deneme {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        Integer a=10;
        int b=2;

        //list.remove(a);
        list.remove(b);

        System.out.println(list);
    }
}
