package _11_While;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // 반복문 Do While
        // 일단 한번 실행 후 조건 검사
        // while, 조건 검사 후 실행 <-> do while, 1회는 무조건 실행

        /*
         * do {
         *    실행 코드 (최초 1회 실행)
         * } while (조건);
         * */

        Scanner scanner = new Scanner(System.in);

//        int choice;
//
//        do {
//            System.out.println("주문");
//            System.out.println("취소");
//            System.out.println("종료");
//            System.out.println("선택");
//            choice = scanner.nextInt();
//
//            switch (choice){
//                case 1:
//                    System.out.println("주문 하기");
//                    break;
//                case 2:
//                    System.out.println("주문 취소");
//                    break;
//                case 0:
//                    System.out.println("종료 하기");
//                    break;
//                default:
//                    System.out.println("유효 하지 않은 기능");
//                    break;
//            }
//        } while (choice != 0); // 0이면 dowhile 종료

        // 1 ~ n 까지의 합
//        int sum = 0;
//        int i = 1;
//        int n;
//        n = scanner.nextInt();
//
//        do {
//            sum += i;
//            i++;
//        } while(i <= n);
//        System.out.println(sum);

        // 숫자 맞추기
        int answer = (int)(Math.random() * 100) + 1;
        System.out.println(answer);
        int n;
        int count = 0;

        do {
            n = scanner.nextInt();
            count++;

            if(n < answer) {
                System.out.println("업");
            } else if (n > answer) {
                System.out.println("다운");
            } else {
                System.out.println("정답");
                System.out.println(count + "회");
            }
        } while (answer != n);
    }
}
