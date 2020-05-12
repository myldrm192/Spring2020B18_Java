package day09_NestdIf_Ternary;

public class ageGroups {

    public static void main(String[] args) {

        int age = 8;
        String ageGroup ="";

        if(age<3 && age>0){
            ageGroup = "Baby";
        }
        else if(age <=5){
            ageGroup = "Toddler";
        }
        else if(age<=9){
            ageGroup = "Kid";
        }
        else if(age<=12){
            ageGroup = "pre-teen";
        }
        else if(age<=17){
            ageGroup = "Teenager";
        }
        else{
            ageGroup = " Bu kadar yeter";
        }

        System.out.println(ageGroup);


    }





}
