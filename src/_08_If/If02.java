package _08_If;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        /*
        * else if 조건문
        *
        * if (조건1) {
        *   조건1이 참일 때 실행
        * } else if (조건2) {
        *   조건2이 참일 때 실행
        * } else {
        *   위 조건들이 모두 거짓일 때
        * }
        * */

        int avgScore = 77;
        /*
        * 90점 이상 A
        * 80점 이상 B
        * 70점 이상 C
        * */

        if (avgScore >= 90 ) {
            System.out.println("A");
        } else if (avgScore >= 80) {
            System.out.println("B");
        } else if (avgScore >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        // 사분면
        // x, y를 입력
        // 입력 했을때 사분면 위치 출력

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        System.out.println("x : ");
        x = scanner.nextInt();
        System.out.println("y : ");
        y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("제 1사분면");
        } else if (x < 0 && y > 0) {
            System.out.println("제 2사분면");
        } else if (x < 0 && y < 0) {
            System.out.println("제 3사분면");
        } else {
            System.out.println("제 4사분면");
        }
    }
}
