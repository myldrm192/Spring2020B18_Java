package day13_StringClass;

import java.util.Scanner;

public class ShippingInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your building number?");
        String buildingNum = input.next();

        input.nextLine();
        System.out.println("Enter your street address");
        String streetAddress = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        String zipCode = input.next();

        input.nextLine();
        System.out.println("Enter full name");
        String fullName = input.nextLine();

        String result = "Ship To: " + fullName+ "\n\t\t "+buildingNum+" "+ streetAddress+"\n\t\t "+ cityName+", " +state+" "+zipCode;
        System.out.println(result);







    }
}
