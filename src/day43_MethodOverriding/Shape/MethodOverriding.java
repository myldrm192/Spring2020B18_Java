package day43_MethodOverriding.Shape;

class Test{
    public void method(){
        System.out.println("Koray");

    }

}

public class MethodOverriding extends Test{
    public void method(){
        System.out.println("Irem");
    }


    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method(); //Koray

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method();

    }

}
