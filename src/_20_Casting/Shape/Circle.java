package _20_Casting.Shape;

/*
* 속성으로 double r 값
* AllArgs 생성자
* area() -> 원의 넓이 구하는 공식
* drawInternal() -> "원 그리기" 출력
* */

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    protected void drawInternal() {
        System.out.println("원 그리기");
    }

    @Override
    public double area() {
        System.out.println("넓이: " + 3.14 * r * r);
        return 3.14 * r * r;
    }

}
