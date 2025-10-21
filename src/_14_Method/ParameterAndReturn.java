package _14_Method;


public class ParameterAndReturn {
    // void 대신 return 값 만들기
    public static int power(int number) {
        return number * number;
    }

    public static int powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = power(5);
        System.out.println(a);

        int b = powerByExp(3, 3);
        System.out.println(b);

        String str = "abc";
        str.length();

    }
}
