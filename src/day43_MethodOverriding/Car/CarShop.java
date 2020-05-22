package day43_MethodOverriding.Car;

public class CarShop {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        tesla.star();

        System.out.println("================");

        Honda honda = new Honda();
        honda.start();

        System.out.println("==============");

        Jeep jeep = new Jeep();
        jeep.start();

        System.out.println("===============");

        BMW bmw = new BMW();
        bmw.start();

    }

}
