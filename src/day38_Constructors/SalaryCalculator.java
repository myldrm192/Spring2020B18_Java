package day38_Constructors;

public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate,double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }


    public double salary(){
        return hourlyRate * weeklyHours * 48;
    }

    public double stateTax(){
        return salary() * weeklyHours;
    }

    public double federalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){  // salary after tax
        return salary() -  ( stateTax() + federalTax() );
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                '}';
    }


}
