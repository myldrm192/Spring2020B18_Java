package day25_MethodRecap;

public class Driver {

    public static void main(String[] args) {
        //  getDriver1(); //argument is mandatory

        String str = getDriver1("Cybertek");

        System.out.println(str);

        String str2   =  getDriver2("ChRoMe");  //

        System.out.println(str2);

        String str3 = getDriver3("FiReFox");

        System.out.println(str3);

    }


    public static String getDriver1(String browserName){

// fire fox ==>firefox
        switch (browserName.toLowerCase()){  // "ChromE".toLowerCase() ==> chrome
            case "chrome":
                return "Chrome Driver";

            case "firefox":
                return "Firefox Driver";

            case "safari":
                return "Safari Driver";

            case "opera":
                return "Opera Driver";

            case "edge":
                return "Edge Driver";

            default:
                return "Invalid Driver";
        }


    }

    public static String getDriver2(String browserName){
        browserName = browserName.toLowerCase();  //to ignore case sensitivity

        if(browserName.equals("chrome")){
            return "Chrome Driver";
        }else if(browserName.equals("firefox")){
            return "FireFox driver";
        }else if(browserName.equals("safari")){
            return "Safari Driver";
        }else if(browserName.equals("edge")){
            return "Edge Driver";
        }else if(browserName.equals("opera")){
            return "Opera Driver";
        }else{
            return "Invalid Driver";
        }

    }
    //:()?, : ,  ()?
    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();
        return (browserName.equals("chrome"))? "Chrome Driver"
                :(browserName.equals("firefox"))? "Firefox Driver"
                :(browserName.equals("safari"))? "Safari Driver"
                :(browserName.equals("edge"))? "Edge Driver"
                :(browserName.equals("Opera"))?"Opera Driver" : "Invalid Driver" ;


    }

}
