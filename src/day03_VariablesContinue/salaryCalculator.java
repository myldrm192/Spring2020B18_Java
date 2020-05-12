package day03_VariablesContinue;

public class salaryCalculator {

    public static void main(String[] args) {

        double HourlyRate = 15;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;


        // salary = horlyRate * weeklyHours * 52
        // stateTax = salary * stateTaxRate
        // federalTax salary * federalTax

        double salary = HourlyRate * weeklyHours * 52;

        double stateTax = salary * stateTaxRate;

        double federalTax = salary * federalTaxRate;

        //salaryAfterTax = salary - stateTax - federalTax
        double salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("Net Salary = $"+salaryAfterTax);



        System.out.println(salary);
        System.out.println(stateTax);
        System.out.println(federalTax);
        System.out.println(salaryAfterTax);





    }






}
