package _34_Lambda;

/*
* 람다식 -> 함수형 프로그래밍을 지원하기 위한 표현식
*
* 람다식의 구조
* 1. 매개변수 목록
* 2. 화살표
* 3. 구현부/ 실행문
* */

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Runnable job1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스");
            }
        };
        job1.run();

        Runnable job2 = () -> System.out.println("람다식");
        job2.run();

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // o1 < o2 -> -1 | o1 == o2 -> 0 | o1 > o2 -> 1
            }
        };
        System.out.println(comparator.compare(2, 3));

        Comparator<Integer> comparator1 = ((o1, o2) -> o1.compareTo(o2));
        System.out.println(comparator1.compare(5, 8));

        // 람다식 장점 -> 코드 간결화, 표현력 향상
        // 람다식 단점 -> 디버깅 힘듦, 재사용성이 낮음, 복잡한 로직 표현 힘듦

        // 함수형 인터페이스
        // Runnable - void run(); -> 단순 실행만 가능한 인터페이스
        // Supplier - T get(); -> 값을 반환 하는 인터페이스
        // Consumer - void accept(T t); -> 반환x, 값을 소비하는 인터페이스
        // Function <T, R> - R apply(T t); -> 연산 수행후 값 반환 , R: 리턴 타입
        // Predicate - boolean test(T t); -> 특정 조건을 검사 후, true / false 반환

        Supplier<String> stringSupplier = () -> "Supplier 인터페이스 문자열 반환";
//        System.out.println(stringSupplier.get());
        Consumer<String> stringConsumer =
                (message) -> System.out.println("메세지: " + message);
        stringConsumer.accept(stringSupplier.get());
    }
}
