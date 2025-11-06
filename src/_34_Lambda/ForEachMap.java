package _34_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForEachMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int count = 3;

        for (int i = 0; i < count; i++) {
            System.out.print("상품명: ");
            String product = scanner.next();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            map.put(product, price);
        }

        System.out.println(map);

        map.forEach((product, price)
                -> System.out.println("[상품명]: " + product + ", " + "[가격]: " + price+ "원"));
    }
}
