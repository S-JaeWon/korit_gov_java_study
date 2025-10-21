package _14_Method;

public class Parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 ^2은 " + result + " 입니다.");
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + " 입니다.");
    }

    public static void avg(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        float avg = sum / 3.0F;
        System.out.println(avg);
    }

    public static void isEven(int num) {
        String check = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(num + " -> " + check);
    }

    public static void main(String[] args) {
        power(2);
        powerByExp(3, 3);

        avg(2, 13, 2);

        isEven(511);
    }
}
