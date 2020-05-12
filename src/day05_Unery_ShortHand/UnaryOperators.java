package day05_Unery_ShortHand;

import sun.lwawt.macosx.CSystemTray;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = -10;
        int nm1 = 100;

        System.out.println(b);

        int c = +b; // -
        System.out.println(c);

        System.out.println(++a);

        int num2= ++a;
        System.out.println(num2);

        int num3 = ++a;
        System.out.println(num3);
        System.out.println(nm1++);

        int z = 100;





        System.out.println(nm1);
        System.out.println(nm1);
        int nm2 = a++;



        System.out.println(nm2);
        System.out.println(nm2);



        System.out.println(-- z);   // 99
        System.out.println(--z);    //98

        System.out.println(z--);     //98 artik degiskenin degeri 98 oldu
        System.out.println(z--);        //97
        System.out.println(z--);


        int x = 100;

        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x++);
        
        int y = 50;

        y = --y + y++ + y-- + y++;     // 49 49 49 50
        System.out.println(y);


        int i = 1;
        i = -i-- + i++ / -i-- * --i;
        System.out.println(i);
        System.out.println(-1+1/-2*1);
        System.out.println(-1+1.0/-2*1);
        System.out.println(-1+1/-2);
        System.out.println(-1+1);
        System.out.println(1/-2);

        int k =50;
        System.out.println(k++);
        System.out.println(k++);

        System.out.println("======================");

        int g = 50;

        System.out.println(++g);
        System.out.println(++g);
        System.out.println(g);

        System.out.println(k++);
        System.out.println(k--);
        System.out.println(k);
           


    }
}

