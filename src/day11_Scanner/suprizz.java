package day11_Scanner;

import com.sun.codemodel.internal.JCase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class suprizz {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen adinizi girin: ");

        String a = input.next();

        switch (a) {
            case ("Irem"):
            case ("irem"):
                System.out.println("Bitanemmmmm seni cok seviyorum");
                break;

            case ("Koray"):
            case ("koray"):
                System.out.println("Oglusum benim");
                break;


            default:
                System.out.println("Baska kadin tanimam");
        }

    }

}
