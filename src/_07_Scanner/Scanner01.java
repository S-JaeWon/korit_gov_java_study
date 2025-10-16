package _07_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner 입력받기

        Scanner scanner = new Scanner(System.in);

        // String 문자열 입력받기
        // next() -> 토큰 단위로 읽기
        // 토큰 -> 공백문자(탭, 띄어쓰기, 엔터)
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1: " + str1);
//        System.out.println("str2: " + str2);

        // nextLine() -> 엔터 단위
//        String str3 = scanner.nextLine();
//        System.out.println("str3: " + str3);

        // int 정수 입력 받기
//        int num1 = scanner.nextInt();
//        System.out.println("num1 : " + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("num2 : " + num2);

//        int num = scanner.nextInt();
//        scanner.nextLine();
//        String str = scanner.nextLine();
//        System.out.println("num : " + num + "str : " + str);

        int age = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(age + "살 " + name + "입니다.");


    }
}
