package _08_If;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        /*
        * 조건문 -> if문
        * if (조건) {
        *     해당 조건이 참일때 실행되는 코드
        *  } else {
        *     해당 조건이 거짓일때 실행되는 코드
        *  }
        * */

        // 키가 120 이상 이면 탑승 가능, 아니면 탑승 불가능
        int height = 110;
        if (height >= 120) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 키가 120 이상, 어린이인 경우
        boolean isKid = true;
        if (height >= 120 && isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 키가 120 이상 이거나 어린이인 경우
        if (height >= 120 || isKid) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 3의 배수 확인
        int num = 12;
        // 3의 배수이면 3의 배수입니다. 출력
        if (num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        }

        // 절댓값 출력
        int num2 = -12;

        if (num2 > 0) {
            System.out.println(num2);
        } else {
            System.out.println(-num2);
        }

        // 최댓값 출력
        int num3 = 12;
        int num4 = 8;

        if (num3 > num4) {
            System.out.println(num3);
        } else {
            System.out.println(num4);
        }

        String userId = "user1212";
        String userPw = "q1w2e3";

        Scanner scanner = new Scanner(System.in);

        String Id;
        System.out.println("아이디 입력 : ");
        Id = scanner.nextLine();
        String Pw;
        System.out.println("비밀번호 입력 : ");
        Pw = scanner.nextLine();

        if (Id.equals(userId)) {
            if(Pw.equals(userPw)){
                System.out.println("로그인 성공");
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("아이디가 틀렸습니다.");
        }
    }
}