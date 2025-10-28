package _20_Casting.Shape;

/*
* 속성으로 밑변, 높이 / double base, height
*
*
* */

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    protected void drawInternal() {
        System.out.println("삼각형 그리기");
    }
    @Override
    public double area() {
        return (base * height) / 2;
    }

}
