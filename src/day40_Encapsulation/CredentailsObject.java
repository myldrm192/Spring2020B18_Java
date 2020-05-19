package day40_Encapsulation;

public class CredentailsObject {

    public static void main(String[] args) {

        Credentails facebook = new Credentails();

        facebook.setUserName("A.paulura");
        facebook.setPassWord("123456");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassWord());


    }
}
