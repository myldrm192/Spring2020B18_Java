package day43_MethodOverriding.Shape;

public class Circle extends Shape{

    public double radius;
    public static double PI= 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        area = radius * radius * PI;
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        perimeter = radius * 2 *PI;
        System.out.println("Perimeter of the shape: "+perimeter);
    }



}
