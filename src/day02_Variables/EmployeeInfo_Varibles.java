package day02_Variables;

public class EmployeeInfo_Varibles {

    public static void main(String[] args) {

        String employeename = "Andrea";
        String companyname = "Oracle";
        int employeeId = 9;
        String jobTitle = "QA";
        double salary = 100000.5;
        long ssn = 12345678;


        System.out.println( "Employee Name: " + employeename);
        System.out.println("Company Name: "+ companyname);
        System.out.println("Employee Id "+employeeId);
        System.out.println("Salary: "+salary);
        System.out.println("SSN "+ssn);

        System.out.println("=================================");

        // tek bir println icerisinde yazabiliriz \n kullanarak

        System.out.println("Employee Name: " + employeename + "\nCompany Name: "+ companyname + "\nEmployee Id "+employeeId);

        System.out.println("=================");


        String firstName = "Irem";
        String lastName = "Yildirim";
        String fullName = "Irem" + " Yildirim";

        System.out.println(fullName);
        System.out.println(firstName+" "+lastName);

        System.out.println(11 + 10); // 21 addition
        System.out.println("11 +10"); //1110 concatenation







    }




}
