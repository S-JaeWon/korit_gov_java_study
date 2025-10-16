package _06_String;

public class String01 {
    public static void main(String[] args) {
        String s = "Jaw Won";
        System.out.println(s.length()); // 문자의 길이
        System.out.println(s.toUpperCase()); // 대문자 변환
        System.out.println(s.toLowerCase()); // 소문자 변환
        System.out.println(s.contains("on")); // 문자 포함 확인 유무
        System.out.println(s.indexOf("a")); // 인덱스
        System.out.println(s.indexOf("b")); // 없다면 -1

        s = "AbCFdE F";
        System.out.println(s.lastIndexOf("F")); // 뒤에서부터 찾기
        System.out.println(s.startsWith("A")); // 문자열의 처음 확인, 맞다면 true
        System.out.println(s.startsWith("B")); // 아니라면 false
        System.out.println(s.endsWith("F")); // 문자열의 마지막 확인
        System.out.println(s.endsWith("c"));

    }
}
