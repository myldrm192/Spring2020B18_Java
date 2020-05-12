package day09_NestdIf_Ternary;

public class NestedIf {

    public static void main(String[] args) {

        int age = 18;
        boolean USCitezen = false;

        if (USCitezen) {
            if (age > 17) {
                System.out.println("vote");
            } else {
                System.out.println("no vote");
            }


        } else {
            System.out.println("Oooo");
        }
    }
}
