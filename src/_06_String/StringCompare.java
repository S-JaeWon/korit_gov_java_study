package _06_String;

public class StringCompare {
    public static void main(String[] args) {
         // 문자열 비교
         String str1 = "Java";
         String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str1.equals("java"));
        System.out.println(str1.equalsIgnoreCase("jAVA")); // 대소문자 구분x

        str1 = "1234";
        str2 = "1234";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        str1 = new String("1234"); // new -> 새 메모리 할당
        str2 = new String("1234");
        System.out.println(str1 == str2); // 참조위치 비교
        System.out.println(str1.equals(str2));
    }
}
