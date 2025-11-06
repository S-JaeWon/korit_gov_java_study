package _35_StreamApi;

import java.util.*;

//2. 브랜드 키워드 입력받기 => stream filter이용해서 키워드 브랜드 뽑아내고 List에 담기
//3. 뽑아온 브랜드 상품들 출력 없으면 없다고 출력

public class StreamApiEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays.asList(
                "애플 아이폰 15 Pro",
                "애플 맥북 프로 M3",
                "애플 아이패드 에어 5세대",
                "애플 에어팟 프로 2세대",
                "삼성 갤럭시 S24 울트라",
                "삼성 갤럭시 Z 플립 5",
                "삼성 갤럭시탭 S9",
                "삼성 갤럭시 워치6",
                "삼성 노트북 갤럭시북4 프로",
                "엘지 울트라기어 게이밍 모니터"
        );
        System.out.print("브랜드 검색: ");
        String brand = scanner.nextLine();

//        List<String> samsungProducts = products.stream()
//                .filter(product -> product.contains("삼성"))
//                .toList();
//        List<String> appleProducts = products.stream()
//                .filter(product -> product.contains("애플"))
//                .toList();
//        List<String> lgProducts = products.stream()
//                .filter(product -> product.contains("엘지"))
//                .toList();
//
//        switch (brand) {
//            case "삼성", "samgsung" -> System.out.println(samsungProducts);
//            case "애플", "apple" -> System.out.println(appleProducts);
//            case "엘지", "lg" -> System.out.println(lgProducts);
//            default -> System.out.println("해당 브랜드 제품이 존재하지 않습니다.");
//        }

        Map<String, String> brandMap = new HashMap<>();
        brandMap.put("삼성", "삼성");
        brandMap.put("samgsung", "삼성");
        brandMap.put("애플", "애플");
        brandMap.put("apple", "애플");
        brandMap.put("엘지", "엘지");
        brandMap.put("lg", "엘지");

        String brand1 = brandMap.get(brand);
        List<String> result = products.stream()
                .filter(product -> product.contains(brand1))
                .toList();

        if (result.isEmpty()) {
            System.out.println("해당 브랜드 제품이 존재하지 않습니다.");
        } else {
            System.out.println(result);
        }
    }
}
