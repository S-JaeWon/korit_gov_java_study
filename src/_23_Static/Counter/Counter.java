package _23_Static.Counter;

/*
* static
* 클래스 차원의 변수나 메소드를 만들 때 사용
* 인스턴스 속하지 않음
* 인스턴스를 생성하지 않고 접근이 가능
* 클래스의 객체를 통한 변수나 메소드와 다름
*
* */

public class Counter {
    public static int count = 0;
    public static void increment() {
        count++;
    }

    public static void main(String[] args) {
        increment();
        increment();
        increment();
        System.out.println(count);
    }
}
