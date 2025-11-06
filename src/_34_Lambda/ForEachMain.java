package _34_Lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "바나나", "파인애플", "수박", "포도");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.forEach(fruit -> System.out.println("과일: " + fruit));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number * 2));
    }
}
