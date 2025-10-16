package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        // 대입 연산자
        int num1 = 10;
        // 수학적 의미인 '같다'와 다름. 해당 값을 변수에 대입한다는 뜻

        // 산술 연산자
        int num2 = 5;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); // 나누기 값 몫
        System.out.println(num1 % num2); // 나누기 값 나머지

        // 복합 대입 연산자
        num1 += 10; // num1 = num1 + 10;
        System.out.println(num1);
        num1 -= 5; // num1 = num1 - 5;
        System.out.println(num1);
        num1 /= 3; // num1 = num1 / 3;
        System.out.println(num1);
        num1 %= 4; // num1 = num1 % 4;
        System.out.println(num1);

        // 증감 연산자
        int j = 10;
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j--);
        System.out.println(j);
        System.out.println(--j);

        // 비교 연산자 -> 결과 값은 항상 boolean
        // == -> 같다
        System.out.println(num1 == num2);
        // != -> 같지 않다
        System.out.println(num1 != num2);
        // >, >=, <, <= -> 크기 비교
        System.out.println(num2 > num1);

        // 논리 연산자
        boolean flag1 = true;
        boolean flag2 = false;
        // & -> and, 둘이 참이면 참
        System.out.println(flag1 & flag2);
        // | -> or, 둘 중 하나라도 참이면 참
        System.out.println(flag1 | flag2);
        // ! -> not, 부정
        System.out.println(!flag1);

        // 논리 연산자 조합
        // A && B -> A 가 참이면 B 실행, 거짓이면 실행x
        // A || B -> A 가 참 이면 B 실행x, 거짓이면 실행
        int A = 10;
        int B = 20;
        System.out.println(B > A && A > 5);
        System.out.println(B < A || B > 10);

        // 삼항 연산자
        int x = 5;
        int y = 3;
        // (조건) ? A : B -> 조건이 참이면 A 실행, 거짓이면 B 실행
        int max = (x > y) ? x : y;
        System.out.println(max);
        int min = (x < y) ? x : y;
        System.out.println(min);

        y = 5;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        String same = (x != y) ? "다름" : "같음";
        System.out.println(same);

        // height라는 int 변수 선언, 키가 120이상인 경우 탑승 가능한 삼항연산자
        int height = 170;
        String possible = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(possible);

        // 홀짝
        int i = 11;
        String result = i % 2 == 0 ? "짝수" : "홀수";
        System.out.println(result);

        // 점수가 0 ~ 100점 까지 일때 90 이상 A, 80 이상 B, 70 이상 C
        int score = 71;
        String grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "F";
        System.out.println(grade);
    }
}
