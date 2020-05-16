package day37_Constructor;

public class InstanceBlock {

    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block1");
    }
    {
        System.out.println("Instance Block2");
    }


    public static void main(String[] args) {

        InstanceBlock obj1 = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();
    }
    {
        System.out.println("Instance Block2");
    }


}

