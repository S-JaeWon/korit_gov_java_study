package _09_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Switch 문
        // break를 만날때 까지 계속 실행

        int rank = 2;

//        if (rank == 1) {
//            System.out.println("전장");
//        } else if (rank == 2) {
//            System.out.println("전장0.5");
//        } else if (rank == 3) {
//            System.out.println("상품권");
//        } else {
//            System.out.println("짝짝짝");
//        }

        switch (rank) {
            case 1:
                System.out.println("전장");
                break;
            case 2:
                System.out.println("전장0.5");
                break;
            case 3:
                System.out.println("상품권");
                break;
            default: // 위 case에 해당하는 사항이 하나도 없는 경우
                System.out.println("짝짝짝");
        }
        // 다른 case에 동일 실행문이 있다면 상단의 case내의 실행문 공백처리 가능

        int grade = 2;
        int price = 7000;
        // 1등급 = 10000, 이후 등급이 떨어질때마다 각각 -1000씩

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                System.out.println(price);
                break;
        }

        // 월을 입력받고(int)
        // 3, 4, 5 -> spring
        // 6, 7, 8 -> summer
        // 9, 10, 11 -> Autumn
        // 12, 1, 2 -> winter

//
//        int month;
//        month = scanner.nextInt();
//
//        switch (month) {
//            case 3: case 4: case 5:
//                System.out.println("Spring");
//                break;
//            case 6: case 7: case 8:
//                System.out.println("Summer");
//                break;
//            case 9: case 10: case 11:
//                System.out.println("Autumn");
//                break;
//            case 12: case 1: case 2:
//                System.out.println("Winter");
//                break;
//            default:
//                System.out.println("존재하지 않는 월 입니다.");
//        }

        // 숫자 a를 입력받고, 연산자 기호(사칙연산)를 입력받고, 숫자 b를 입력

        int a;
        a = scanner.nextInt();
        String c;
        c = scanner.next();
        int b;
        b = scanner.nextInt();

        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("유효하지 않은 기호 입니다.");
        }

    }
}
