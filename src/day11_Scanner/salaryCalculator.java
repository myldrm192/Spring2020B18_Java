package day11_Scanner;

import java.util.Scanner;

public class salaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary:  ");
        int salary = input.nextInt();

        System.out.println("Enter the state tax:  ");
        byte stateTax = input.nextByte();

        double stateTaxPercentage = stateTax / 100.0 ;
        System.out.println(stateTaxPercentage);

        System.out.println("Enter the federal tax: ");
        byte federalTax = input.nextByte();

        double federalTaxPercentage = federalTax / 100.0;
        System.out.println(federalTaxPercentage);

        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;
        System.out.println(totalTax);

        double salaryAfterTax = salary - totalTax;
        System.out.println("Your salary after tax: " + salaryAfterTax);


    }
}
