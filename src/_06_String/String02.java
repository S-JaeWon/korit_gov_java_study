package _06_String;

public class String02 {
    public static void main(String[] args) {
        String s = "AbCAFdAE F";
        System.out.println(s.replace("A", "B")); // A, B -> A의 값을 B로 대체
        System.out.println(s.substring(2)); // 인덱스 기준 특정 위치에서 부터 출력
        System.out.println(s.substring(2, 4)); // 범위를 정해서 출력, 마지막 인덱스는 포함x
        System.out.println(s.indexOf("C"));
        System.out.println(s.substring(s.indexOf("C")));

        s = "  Abc DEF   ";
        System.out.println(s.trim()); // 문자열의 앞 뒤 공백 제거

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(" ").concat(s2));
    }
}
