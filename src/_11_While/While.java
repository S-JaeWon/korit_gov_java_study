package _11_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 반복문
        // 조건이 참일 경우 반복
        // for문 -> 회수
        // while문 -> 조건

        /*
        * while(조건) {
        *   실행할 코드
        * }
        * */

        // 1 ~ 5 까지 출력
//        int i = 1;
//
//        while (i <= 5) {
//            System.out.println(i++);
//        }
//
//        i = 10;
//        while (i >= 1) {
//            System.out.println(i--);
//        }
//
//        // 짝수만 출력
//        i = 1;
//        while (i <= 10){
//            if (i % 2 ==0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//
//        boolean flag = true;

//
//        while (flag) {
//            int score = scanner.nextInt();
//            if (0 <= score && score <= 100) {
//                System.out.println("score : " + score);
//                flag = false;
//            } else {
//                System.out.println("유효하지 않은 점수입니다.");
//            }
//        }

//        int menu;
//
//        while (true) {
//            System.out.println("메뉴를 선택하세요.");
//            System.out.println("1. 주문하기");
//            System.out.println("2. 취소하기");
//            System.out.println("3. 재주문하기");
//            System.out.print("메뉴를 고르세요 -> ");
//            menu = scanner.nextInt();
//
//            switch (menu) {
//                case 1:
//                    System.out.println("메뉴주문");
//                    break;
//                case 2:
//                    System.out.println("취소");
//                    break;
//                case 3:
//                    System.out.println("재주문");
//                    break;
//                default:
//                    System.out.println("다시 골라주세요");
//                    continue;
//            }
//            break;
//        }

        // 1 ~ 100의 합
//        int num = 0;
//        int sum = 0;
//
//        while (true) {
//            sum += num;
//            ++num;
//            if (num > 100) {
//                break;
//            }
//        }
//        System.out.println(sum);

        // 1 ~ 100
        // 10일때 메뉴 sold out
        // sold out 이면 가게 폐점
        // 폐점 이후 영업 종료 출력
        int customer = 0;

//        while (customer <= 100) {
//            ++customer;
//            System.out.println(customer + " 번째 손님 입장");
//            if (customer % 10 == 0) {
//                System.out.println("Sold Out");
//                break;
//            }
//        }
//        System.out.println("영업종료");

        int noShow;
        int menu = 20;
        noShow = scanner.nextInt();

        while (customer <= 50) {
            ++customer;
            menu--;
            if(customer == noShow){
                System.out.println(noShow + " 번 손님 노쇼");
                menu++;
            } else {
                System.out.println(customer + " 번째 손님 입장");
            }
            if (menu == 0) {
                System.out.println("Sold Out");
                break;
            }
        }
        System.out.println("영업 종료");

    }
}
