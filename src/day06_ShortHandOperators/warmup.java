package day06_ShortHandOperators;

public class warmup {

    public static void main(String[] args) {

        //task 2

        // 1 gollan = 3.785 liters

        int gallon = 100;
        double liters = gallon*3.785; // converts gallon to liters
        System.out.println(gallon + " gallons equel to "+ liters + " litters");

        double L = 100;
        double G = L / 3.785; //converts liters to gallon
        System.out.println(L + " liters equel to " + G + " galons");


        String result1 = gallon + " gallons equel to "+ liters + " litters";

        System.out.println(result1);

        // task 1

        int x =2;
        int y =x++; //y=2 x=3



    }




}
