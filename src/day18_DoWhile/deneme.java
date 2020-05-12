package day18_DoWhile;

public class deneme {

    public static void main(String[] args) {

        int z=1;
        do {
            System.out.println(z);
            if (z==3){

                break;
            }
            z++;
        }while(z<=5);

    }
}
