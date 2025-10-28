package _20_Casting.Shape;



public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 15);
        Triangle triangle = new Triangle(5, 12);

        circle.render();
        circle.area();

        rectangle.render();
        rectangle.area();

        triangle.render();
        triangle.area();

        // 업 캐스팅
        Shape a = new Circle(5);
        Shape b = new Rectangle(10, 15);
        Shape c = new Triangle(5, 12);

        Shape[] shapes = {
                a,
                b,
                c
        };

        double sum = 0;

        for(Shape shape : shapes) {
            sum += shape.area();
        }
        System.out.println("넓이 합: " + sum);

        // 다운 캐스팅
        Circle circle1 = (Circle) a;
        Rectangle rectangle1 = (Rectangle) b;
        Triangle triangle1 = (Triangle) c;
        circle1.render();
    }
}
