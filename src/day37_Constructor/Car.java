package day37_Constructor;

public class Car {

    String color;
    String model;
    int years;

    public Car(String color, String model, int years){
        this.color=color;
        this.model=model;
        this.years=years;
        System.out.println("Deneme");

    }

    public String toString(){
        return years+color+model;

    }
}
