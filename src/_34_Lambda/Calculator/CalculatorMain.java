package _34_Lambda.Calculator;

import java.util.function.Predicate;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (int x, int y) -> x + y;
        Calculator sub = (int x, int y) -> x - y;
        Calculator mul = (int x, int y) -> x * y;
        Calculator div = (int x, int y) -> x / y;

        Predicate<Integer> isZero = (numb) -> {
            if (numb == 0) {
                return true;
            }
            return false;
        };

        System.out.println("1 + 2 = " + operate(1, 2, add));
        System.out.println("3 - 2 = " + operate(3, 2, sub));
        System.out.println("3 * 2 = " + operate(3, 2, mul));
        System.out.println("3 / 2 = " + operate(3, 2, div));

        Calculator div2 = (int x, int y) -> {
            if (isZero.test(y)) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };
        System.out.println(operate(4, 0, div2));


    }
}
