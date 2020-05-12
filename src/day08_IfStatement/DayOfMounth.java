package day08_IfStatement;

public class DayOfMounth {

    public static void main(String[] args) {

        byte day = 3;

        boolean day28 = day==2;
        boolean day30 = day==4 &&day==6 && day==9 && day==11;
        boolean day31= !day28 && !day30;
        if (day28){
            System.out.println("It has 28 days");
        }
        if (day30){
            System.out.println("it has 30 days");
        }
        else {
            System.out.println("it has 31 days");
        }
    }


}
