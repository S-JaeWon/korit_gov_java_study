package _20_Casting.Shape;

/*
* 속성 double w, h (가로 세로)
* area() -> w * h
* */

public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    protected void drawInternal() {
        System.out.println("네모 그리기");
    }

    @Override
    public double area() {
        return w * h;
    }
}
