package _29_Collections.Map;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        /*
        * Map -> Key(키) 와 Value(값)로 이루어짐.
        * Key는 중복x, 인덱스가 없어 Key로 Value 값 찾을 수 있음.
        * */
        // Map<자료형[키], 자료형[값] 맵이름 = new HashMap<>();
        Map<String, String> strMap = new HashMap<>();

        strMap.put("언어1", "자바"); // 값 대입 .put(키, 값);
//        strMap.put("언어1", "자바"); 키 중복 x
        strMap.put("언어2", "파이썬");
        strMap.put("언어3", "자바"); // 값 중복 o
        strMap.put("언어4", "고");
        strMap.put("언어4", "코틀린"); // 키가 동일 하다면 value는 최신거로 들어감

        System.out.println(strMap);
        System.out.println(strMap.get("언어1")); // 값 출력
        System.out.println(strMap.get("언어4"));

        strMap.replace("언어1", "스위프트"); // key를 이용한 value 값 변경
        strMap.remove("언어3"); // Key를 이용한 값 제거
        System.out.println(strMap);
        System.out.println(strMap.get("언어1"));

        System.out.println(strMap.containsKey("언어3")); // 키 포함 여부
        System.out.println(strMap.containsValue("자바")); // 값 포함 여부

        /*
        * Map은 직접 순회 x
        * Map은 Collection와 달리 Iterable이라는 인터페이스가 구현된 클래스가 아니기 때문
        * */

        System.out.println(strMap.keySet()); // 키 만 set 형태로 출력
        System.out.println(strMap.entrySet()); // 키 = 값, 을 set 형태로 출력 , {} [] 차이

        // KeySet을 통한 순회
        for (String key : strMap.keySet()) {
            System.out.println(key + ": " + strMap.get(key));
        }

        // 오름차순
        List<String> keyList = new ArrayList<>(strMap.keySet()); // Set 형태를 List로 형변환, 키 만
        Collections.sort(keyList);
        Collections.sort(keyList, Comparator.reverseOrder()); // 내림차순

        for (String key : keyList) {
            System.out.println(key + ": " + strMap.get(key));
        }

        // entrySet을 통한 순회
        for (Map.Entry<String, String> entry : strMap.entrySet()) {
            System.out.println(entry); // 키, 값
            System.out.println(entry.getKey()); // 키
            System.out.println(entry.getValue()); // 값
        }
        
        // Map -> Set (키와 값)
        Set<Map.Entry<String, String>> entrySet = new HashSet<>(strMap.entrySet());
        System.out.println(entrySet);
        // Map -> List (키와 값)
        List<Map.Entry<String, String>> entryList = new ArrayList<>(strMap.entrySet());
        System.out.println(entryList);
        
        // Map 은 빠른 탐색 및 검색을 위해 설계된 클래스. 정렬 기능 x
        Collections.sort(entryList, Map.Entry.comparingByValue()); // 값 기준 정렬
        Collections.sort(entryList, Map.Entry.comparingByKey()); // 키 기준 정렬
        Collections.sort(entryList, Map.Entry.comparingByValue(Comparator.reverseOrder())); // 값 기준 내림차순
        Collections.sort(entryList, Map.Entry.comparingByKey(Comparator.reverseOrder())); // 키 기준 내림차순

    }
}
