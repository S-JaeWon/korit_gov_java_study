package _20_Casting.Shape;

/*
 * render() -> preDraw(), drawInternal(), postDraw();
 *
 * 접근제어자 protected
 * preDraw -> "그리기 준비" 출력
 * postDraw -> "그리기 마무리" 출력
 *
 * 추상 메소드
 * area() -> double,  drawInternal() protected -> void
 * */

public abstract class Shape {
    protected void preDraw() {
        System.out.println("그리기 준비");
    }

    protected void postDraw() {
        System.out.println("그리기 마무리");
    }

    protected abstract double area();

    protected abstract void drawInternal();
}
