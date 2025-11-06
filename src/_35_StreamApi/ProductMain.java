package _35_StreamApi;

import java.util.*;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Product> products = Arrays.asList(
                new Product("삼성 갤럭시북3 프로", 1850000),
                new Product("삼성 갤럭시북 이온", 1350000),
                new Product("삼성 갤럭시탭 S9", 950000),
                new Product("삼성 갤럭시 S24 울트라", 1590000),
                new Product("애플 맥북에어 M2", 1690000),
                new Product("애플 맥북프로 M3", 2490000),
                new Product("애플 아이패드 에어 5세대", 929000),
                new Product("애플 아이폰 15 프로", 1550000),
                new Product("LG 그램 17", 2190000),
                new Product("LG 울트라PC", 1140000)
        );

        Map<String, String> brandMap = new HashMap<>();
        brandMap.put("삼성", "삼성");
        brandMap.put("samgsung", "삼성");
        brandMap.put("애플", "애플");
        brandMap.put("apple", "애플");
        brandMap.put("엘지", "LG");
        brandMap.put("lg", "LG");

        System.out.print("브랜드명: ");
        String brand = scanner.nextLine();
        System.out.print("가격: ");
        int price = scanner.nextInt();

        String brand1 = brandMap.get(brand);

        List<Product> productList = products.stream()
                .filter(product -> product.getName().contains(brand1))
                .filter(product -> product.getPrice() < price)
                .toList();

        if (productList.isEmpty()) {
            System.out.println("해당 브랜드 제품이 존재하지 않습니다.");
        } else {
            productList.forEach(System.out::println);
        }
    }
}
