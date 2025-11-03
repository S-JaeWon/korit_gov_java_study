package _29_Collections.Map;

import java.util.*;

public class ProductMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        String product;
        int price;

        for (int i = 0; i < 5; i++) {
            System.out.print("상품 등록하기: ");
            product = scanner.next();
            System.out.print("가격 등록하기: ");
            price = scanner.nextInt();

            productMap.put(product, price);
        }
        System.out.println(productMap);

        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + "원");
        }

        String updateProduct;
        int updatePrice;

        while (true) {
            System.out.print("수정할 상품명: ");
            updateProduct = scanner.next();

            if (!productMap.containsKey(updateProduct)) {
                System.out.println("해당 상품이 없습니다.");
                continue;
            }

            System.out.print("수정할 가격: ");
            updatePrice = scanner.nextInt();

            productMap.replace(updateProduct, updatePrice);
            System.out.println("가격이 수정되었습니다.");
            break;
        }

        String searchProduct;
        System.out.print("검색할 상품명: ");
        searchProduct = scanner.next();
        if(!productMap.containsKey(searchProduct)) {
            System.out.println("해당 상품이 없습니다.");
        } else {
            System.out.println(productMap.get(searchProduct) + "원");
        }

        List<String> productList = new ArrayList<>(productMap.keySet());
        Collections.sort(productList);
        System.out.println("오름차순 정렬: " + productList);
        Collections.sort(productList, Comparator.reverseOrder());
        System.out.println("내림차순 정렬: " + productList);

    }
}
