package _35_StreamApi;

/*
* Collection 과 Array에 저장된 데이터를 선언형으로 처리하기 위한 추상화된 반복 프레임워크
* 데이터로부터 메소드 체이닝 형태로 여러 연산을 연결해 수행
*
* 간결성
* 메서드 체이닝으로 인한 가독성 향상 및 간결해짐
* 함수형 프로그래밍
* */

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "최칠");

        // filter() -> 조건을 통해 값을 거름
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();

        System.out.println(namesWithKim);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // map() -> 내부 요소들에게 각각 메소드를 적용하는 형태

        List<Integer> multiNumbers = numbers.stream()
                .map(number -> number * 2)
                .toList();

        System.out.println(multiNumbers);

        List<String> engNames =
                Arrays.asList("james", "emily", "michael", "mia", "william");

        List<String> result = engNames.stream()
                .filter(name -> name.startsWith("m"))
                .map(String::toUpperCase) // :: 해당 타입 클래스의 메소드를 직접 호출해서 각각 요소에 적용
                .sorted()
                .toList();

        System.out.println(result);
        result.forEach(name -> System.out.println(name));
        result.forEach(System.out::println);


        List<String> result1 = engNames.stream()
                .filter(name -> name.length() > 5)
                .toList();

        System.out.println("결과: " + result1);

        int count = 0;
        for (int i = 0; i < engNames.size(); i++) {
            if (engNames.get(i).length() > 5) {
                count++;
            }
        }

        for (String name : result1) {
            if(name.length() > 5) {
                System.out.println(name);
            }
        }
    }
}
