package _20_Casting.Shape;



public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 15);
        Triangle triangle = new Triangle(5, 12);

        circle.preDraw();
        circle.drawInternal();
        System.out.println("넓이 : " + circle.area());
        circle.postDraw();
        circle.render();

        Shape a = new Circle(5);
        Shape b = new Rectangle(10, 15);
        Shape c = new Triangle(5, 12);

        Shape[] shapes = {
                a,
                b,
                c
        };

        for(Shape shape : shapes) {
            shape.drawInternal();
        }

        circle.render();
    }
}
