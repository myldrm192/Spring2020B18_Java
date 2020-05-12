package day12_JacaRecap;

// import PackageName.className;
import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fullAddress = "";

        System.out.println("Enter number of building");
        short Bnumber = scan.nextShort();
        fullAddress +=Bnumber+" ";

        System.out.println("Enter the Street Name: ");
        String streetName = scan.next();
        fullAddress+=streetName+" ";










    }
}
