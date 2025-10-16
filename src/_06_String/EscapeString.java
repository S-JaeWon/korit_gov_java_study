package _06_String;

public class EscapeString {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        // \n, \t, \\, \", \'
        System.out.println("AB\nCD\nE"); // \n -> 줄바꿈
        System.out.println("AB\tCDE"); // \t -> tap 공백(4칸)
        System.out.println("AB\\CDE"); // \를 문자열로 쓰고 싶을때 \\ 사용
        System.out.println("AB\"CDE"); // "를 문자열로 쓰고 싶을때
        System.out.println("AB\'CDE"); // '를 문자열로 쓰고 싶을때, 단 '는 단일로 써도 상관x

        // char c = '''; -> 불가능
        char c = '\'';

        String id = "960507-123456"; // 1까지 출력
        System.out.println(id.substring(0, 8));
    }
}
