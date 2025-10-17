package _10_For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // 반복문 for
        /*
        * for (선언; 조건; 증감) {
        *   반복될 코드
        * }
        * */

//        for (int i = 0; i <= 10; i += 2) {
//            System.out.println(i);
//        }

        // 1 ~ 100까지 다 더한 총합
//        int i = 0;
//        for (int j = 1; j < 101; j++) {
//            i += j;
//        }
//        System.out.println(i);

        // 1 ~ 100까지 중 짝수만 더한 총합
//        int i = 0;
//        for (int j = 0; j < 101; j += 2) {
//            i += j;
//            System.out.println(i);
//        }
//        System.out.println(i);

        // 구구단 출력
//        Scanner scanner = new Scanner(System.in);
//        int i;
//        i = scanner.nextInt();
//        int result = 0;
//
//        for (int j = 1; j < 10; j++) {
//            result = i * j;
//            System.out.println(result);
//        }
//
//        for (int j = 1; j < 10; j++) {
//            System.out.println(j + "단");
//            for (int k = 1; k < 10; k++) {
//                System.out.println(k * j);
//            }
//        }

        /*
        * *
        * **
        * ***
        * ****
        * */

//        for (int i = 1; i < 6; i++) {
//            for (int j = 1; j < 6; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 5; i > 0; i++) {
//            for (int j = 1; j < 6; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // break, continue

//        for (int i = 0; i < 10; i++) {
//            if (i == 7) {
//                continue;
//            }
//
//            if (i == 9) {
//                break;
//            }
//
//            System.out.println(i);
//        }

        // 1 ~ 50까지 3의 배수 제외

//        for (int i = 1; i < 51 ; i++) {
//            if (i % 3 == 0) {
//                System.out.println(" ");
//                continue;
//            }
//            System.out.println(i);
//        }

        // 1부터 시작해서 1씩 증가하면서 각각의 합할때 합 한 수가 200넘어가면 stop
        // 마지막 합한 수와 더한 수 출력

//        int result = 0;
//        for (int i = 0; ; i++) {
//            result += i;
//            if(result > 200) {
//                System.out.println(i);
//                System.out.println(result);
//                break;
//            }
//        }

        // 1 ~ 100 까지 중 3의 배수와 5의 배수 각각 출력
//        int count3 = 0;
//        int count5 = 0;
//
//        for (int i = 1; i < 101; i++) {
//            if(i % 3 == 0) {
//                count3++;
//            }
//            if(i % 5 == 0) {
//                count5++;
//            }
//        }
//        System.out.println("3의배수 : " + count3);
//        System.out.println("5의배수 : " + count5);

        // 정수 5개 입력시 가장 큰 수 출력
        Scanner scanner = new Scanner(System.in);
//        int num;
//        int max = 0;
//        for (int i = 0; i < 5; i++) {
//            num = scanner.nextInt();
//            if (num < 1 || num > 100) {
//                System.out.println("범위를 벗어났습니다.");
//                break;
//            }
//            if (max < num) {
//                max = num;
//            }
//        }
//        System.out.println(max);


        // 팩토리얼 구하기
//        int num;
//        num = scanner.nextInt();
//        int result = 1;
//
//        for (int i = 1; i <= num; i++) {
//            result *= i;
//        }
//        System.out.println(result);

        for (int i = 1; i <= 50; i++) {
            boolean flag = true;

            if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                System.out.println("짝");
                flag = false;
            } else if (i % 10 == 5) {
                System.out.println("으악");
                flag = false;
            }
            if (i / 10 == 3) {
                System.out.println("짝");
                flag = false;
            }
            if (i == 50) {
                System.out.println("으악");
                flag = false;
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
