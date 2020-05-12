package day10_SwitchAndScanner;

public class days {

    public static void main(String[] args) {

        int num=3;
        String result= "";
        String result2="";

        if(num>=1 &&num<=7){

            result=(num==1)? "monday":(num==2)? "tuesday" :(num==3)? "wednesday" : (num==4)? "thursday"
                    :(num==5)? "friday" :(num==6)? "saturday" :"sunday";



        }else{
            System.out.println(("Invalid"));
        }

        result2=(num==1)? "monday":(num==2)? "tuesday" :(num==3)? "wednesday" : (num==4)? "thursday"
                :(num==5)? "friday" :(num==6)? "saturday" :(num==7)? "sunday":("Invalid");



        System.out.println(result);
        System.out.println(result2);
    }
}
