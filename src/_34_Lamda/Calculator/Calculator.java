package _34_Lamda.Calculator;

/*
* 람다식은 단일(하나의) 메소드만 가지는 함수형 인터페이스
* @FunctionalInterface -> 컴파일 시 단일 메소드인지 체크
* */

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
}
