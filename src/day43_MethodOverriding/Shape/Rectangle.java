package day43_MethodOverriding.Shape;

public class Rectangle extends Shape {

    /*
    inherited:
            area, perimeter
            calculateArea(), calculatePerimeter()
     */

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void calculateArea(){
        area = length * width;
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        perimeter = (length+width)*2;
        System.out.println("Perimeter of the shape: "+perimeter);
    }
}