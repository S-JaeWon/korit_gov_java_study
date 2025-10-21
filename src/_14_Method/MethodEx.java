package _14_Method;

public class MethodEx {
    public static int getMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    public static boolean isEven(int a) {
        boolean check = a % 2 == 0 ? true : false;

        return check;
    }

    public static int getAbs(int b) {
        int find = b > 0 ? b : -b;

        return find;
    }

    public static boolean isContain(int[] numbers, int number1) {
        for (int number : numbers) {
            if (number == number1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 숫자 3개의 최댓값 구하기
        // ex) max(3, 5, 7) -> 7

        System.out.println(getMax(11, 2, 8));

        // 홀짝 구하기
        // 짝수 -> true, 홀수 -> false

        System.out.println(isEven(2));

        // 절댓값 구하기
        // 삼항연산자 이용

        System.out.println(getAbs(-80));

        // 포함 여부 (선형탐색)
        // contains([1, 5, 3], 3) -> true, 없으면 false

        System.out.println(isContain(new int[]{5, 1, 15, 8, 19}, 6));

    }
}
