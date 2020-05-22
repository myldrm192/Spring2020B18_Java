package day43_MethodOverriding.Shape;

public class Square extends Shape {

    public double side;

    public Square(double side){
        this.side = side;
    }
@Override
    protected void calculateArea(){
        area = side*side;
        System.out.println("Area of the shape: "+area);
    }

    public void calculatePerimeter(){
        perimeter = side*4;
        System.out.println("Perimeter of the shape: "+perimeter);
    }
}
