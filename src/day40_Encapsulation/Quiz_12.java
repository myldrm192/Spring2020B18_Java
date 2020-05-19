package day40_Encapsulation;

public class Quiz_12 {

    public static String name = "Osman";

    public Quiz_12(){ // constructor
       name = "Hilal";
    }

    { // instance block
        name = "Marionela";
    }

    static{
        name = "Madina";
    }

    public static void main(String[] args) {
        // System.out.println(name); // Madina

        Quiz_12 obj  = new Quiz_12();
        //name = madina
        //  name = "Marionela";
        //  name = "Hilal";

        System.out.println(name);

    }
}
