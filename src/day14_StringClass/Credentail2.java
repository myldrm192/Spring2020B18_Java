package day14_StringClass;

import java.util.Scanner;

public class Credentail2 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your username");
        String userName = input.nextLine();

        System.out.println("Enter your password");
        String passWord = input.nextLine();

        boolean logedIn = userName.equals("Cybertek") && passWord.equals("cybertekschool");

        boolean InvalidUserName = ! userName.equals("Cybertek") && passWord.equals("cybertekschool");

        boolean InvalidPassWord = userName.equals("Cybertek") && ! passWord.equals("cybertekschool");

        if (!userName.isEmpty() && !passWord.isEmpty()){

            if (logedIn) {
                System.out.println("Log in");

            }else if (InvalidUserName){
                System.out.println("username is incorrect");
            }else if (InvalidPassWord){
                System.out.println("password is incorrect");
            }else{
                System.out.println("both incorrect");
            }

        }else{
            System.out.println("Please Enter the Credentails");
        }













    }
}
