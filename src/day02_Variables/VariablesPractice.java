package day02_Variables;

public class VariablesPractice {

    public static void main(String[] args) {

        int salary = 120000;
        double stateTax = 0.065;
        float federalTax = 0.18f;
        // salary after tax = salary(1-sum of taxes)

        double sumTaxes= federalTax + stateTax;

        double salaryAfterTax = salary * (1-sumTaxes);

        System.out.println(salaryAfterTax);

        // area of the circle = r * r * pi

        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);


        System.out.println("=================================");

        double kg = 60;  // int te olabilir
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("=============================");

        int lira = 1000;
        double liraInDolar = lira/6.15;
        System.out.println(liraInDolar);






    }




}
