package _29_Collections.List;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // List -> 순서가 있는 데이터의 집합, 중복 가능
        List<String> strList1 = new ArrayList<>();

        // 요소 추가
        strList1.add("A");
        strList1.add("B");
        strList1.add("A");

        // 선언과 동시에 값 추가, Arrays.asList(값1, 값2, ...);
        List<String> strList2 = new ArrayList<>(Arrays.asList("A", "B", "C"));

        List<String> strList3 = new ArrayList<>();
        strList3.add("java");
        strList3.add("python");
        strList3.add("C#");
        strList3.add("javascript");
        strList3.add("kotlin");

        String[] strArray = new String[2];
        strArray[0] = "철수";
        strArray[1] = "영희";
        System.out.println(strArray[0]); // 기존 배열의 데이터 접근
        System.out.println(Arrays.toString(strArray)); // 기존 배열의 호출

        System.out.println(strList1.get(1));
        System.out.println(strList2.get(2));
        System.out.println(strList3.get(4));
        System.out.println(strList3); // List 호출

        // 특정 요소의 포함 여부
        String searchData1 = "python";
        boolean isContain1 = strList3.contains(searchData1);
        System.out.println(isContain1);

        String searchData2 = "py";
        boolean isContain2 = strList3.contains(searchData2);
        System.out.println(isContain2);

        String email = "example@naver.com";
        boolean isContain3 = email.contains("@");
        System.out.println(isContain3);

        // 요소 삭제
        String removeData1 = "kotlin";
        boolean isRemove1 = strList3.remove(removeData1);
        System.out.println(isRemove1);
        System.out.println(strList3);

        // 정렬
        Collections.sort(strList1); // 오름차순
        System.out.println(strList1);

        Collections.sort(strList1, Collections.reverseOrder()); // 내림차순 Collections.reverseOrder()
        System.out.println(strList1);

        // 길이
        System.out.println(strList1.size()); // length -> size

        for (int i = 0; i < strList3.size(); i++) {
            System.out.println(strList3.get(i) + " 언어");
        }

        for (String s : strList3) {
            System.out.println(s + " 언어");
        }


    }
}
