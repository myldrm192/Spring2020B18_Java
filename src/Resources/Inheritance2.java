package Resources;

import day42_Inheritance.AccesModifiers;

public class Inheritance2 extends AccesModifiers {

    //      sub                   super

    /*
    publicVariable
    protectedVariable
    publicMethod
    protectedMethod
     */


    public static void main(String[] args) {
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
        //  System.out.println( Inheritance2.defaultVariable );

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
        // Inheritance2.defaultMethod();

    }
}
