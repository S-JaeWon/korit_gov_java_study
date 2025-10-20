package _12_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 정렬
        int [] number = {1, 3, 6, 7, 5, 2, 8, 9, 4};
        System.out.println(Arrays.toString(number));

        // 오름차순
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        // 내림차순 1)
        for (int i = 0; i < number.length / 2; i++) {
            int temp = number[i]; // 배열 값을 임시 변수에 대입
            int rev = (number.length - 1) - i; // 역순
            number[i] = number[rev]; // 뒷자리 -> 앞자리
            number[rev] = temp; // 앞자리 -> 뒷자리
        }
        System.out.println(Arrays.toString(number));

        // 내림차순 2)
        Integer[] numb = {1, 3, 6, 7, 5, 2, 8, 9, 4}; // int -> Integer
        Arrays.sort(numb);
        Arrays.sort(numb, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numb));
        /*
        * int != Integer
        * int -> 원시 자료형, 연산만 가능
        * Integer -> 클래스, 다양한 기능 가능
        * double -> Double
        * float -> Float
        * long -> Long
        * */

        // 평균 구하기
        int sum = 0;
        float avg = 0F;
        int [] score = {100, 88, 100, 100, 90};

        for (int j : score) {
            sum += j;
        }
        System.out.println(sum);
        avg =  sum / (float) score.length;
        System.out.println(avg);

        //최대, 최소 구하기
        int [] score2 = {79, 88, 91, 33, 100, 55, 95};
        int max = score2[0];
        int min = score2[0];

        for (int i = 1; i < score2.length; i++) {
            if(score2[i] > max) {
                max = score2[i];
            } else if (score2[i] < min) {
                min = score2[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        // 요일 출력
        // 1 ~ 7 까지 숫자 입력시 요일 출력
        // 그 외 숫자는 "잘못 입력하셨습니다." 출력
        Scanner scanner = new Scanner(System.in);
        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        int day;
        day = scanner.nextInt();

        if (0 < day && day < 8) {
            System.out.println(week[day - 1]);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        // 값 target이 처음 나타내는 인덱스를 찾고, 없으면 -1 출력
        // 찾을 target은 1 ~ 10 까지 입력받기
        int target;
        target = scanner.nextInt();

        int [] a = {4, 2, 7, 2, 3, 7, 4};
        int find = -1;

        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                find = i;
                break;
            }
        }
        System.out.println(find);

    }
}
