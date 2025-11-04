package _31_StringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        // String, StringBuffer[다중스레드], StringBuilder[단일스레드]
        String str = "abcdefg";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder: " + sb);

        // String 변환
        System.out.println("String: " + sb.toString());

        // 문자열 추출
        System.out.println("문자열 추출: " + sb.substring(2, 4)); // 2 ~ 4 까지 출력, 단 끝 인덱스 제외

        // 문자열 추가
        System.out.println("문자열 추가: " + sb.insert(2, "추가"));

        // 문자열 삭제
        System.out.println("문자열 삭제: " + sb.delete(2, 4));

        // 문자열 연결
        System.out.println("문자열 연결: " + sb.append("hijk"));

        // 문자열 길이
        System.out.println("문자열 길이: " + sb.length());

        // 용량의 크기
        System.out.println("용량의 크기: " + sb.capacity());

        // 문자열 뒤집기
        System.out.println("문자열 뒤집기: " + sb.reverse());
    }
}
