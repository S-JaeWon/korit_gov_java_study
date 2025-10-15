package _02_DataTypes;

/*
*   표기법
*
*   카멜 표기법 (단봉낙타 표기법) - 변수명, 메소드명
*   firstName
*
*   파스칼 표기법 (쌍봉낙타 표기법) - 클래스명, 파일명
*   FirstName
*
* */

public class DataTypes {
    public static void main(String[] args) { // main -> void main 단축어
        /*
        *  정수형
        *   int - 4byte
        *   long - 8byte
        *
        *  문자형
        *   char
        *
        *  실수형
        *   float - 4byte
        *   double - 8byte
        *
        *  논리형
        *   boolean - 1byte | true(1), false(0)
        *
        * */
        System.out.println("안녕하세요"); // 문자열 -> "" 로 표시
        System.out.println(123); // 정수형
        System.out.println("123"); // 문자형
        System.out.println(3.14); // 실수형

        /*
       * 변수 - 값을 담는 바구니 | 재사용성 향상, 유지보수 향상
       * 자료형 변수명 = 데이터'
       * 자료형은 데이터의 형태
       * */
        int num1 = 10;
        System.out.println(num1);

        long num2 = 1000000000000000000L; // long 사용시 숫자 뒤에 'L' 로 표시
        num2 = 2_000_000_000_000_000_000L; // 변수 재할당, 화폐 구분시 ',' 대신 '_'
        System.out.println(num2);

        double num3 = 1.1212;
        System.out.println(num3);

        float num4 = 1.12123184685451F; // float 사용시 숫자 뒤에 'F' 로 표시
        System.out.println(num4);

        char lastName = '심'; // 한 글자를 '' 로 감싸기
        String firstName = "재원"; // 문자열, 대문자로 시작, ""로 감싸기

        System.out.print(lastName); // ln -> 줄바꿈
        System.out.println(firstName);

        char char1 = '가';
        char char2 = '나';
        char char3 = '다';
        System.out.println(char1 + char2 + char3); // 아스키 코드로 출력
        System.out.println("" + char1 + char2 + char3); // 문자열로 출력

        boolean isEmpty = false; // data로 true 나 false 만 들어 올 수 있음
        System.out.println(isEmpty);

        // 이름 변수와 나이 변수, 주소 변수 선언
        String name = "심재원";
        int age = 30;
        String address = "남구";

        System.out.println("제 이름은 " + name + " 이고, 나이는 " + age + "살이며, " + address + "에서 살고 있습니다.");


    }
}
