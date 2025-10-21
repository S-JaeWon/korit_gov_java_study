package _15_Overloading;

public class OverloadingEx {
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    private static double getMax(double a, double b) {
        return  a > b ? a : b;
    }

    public static void main(String[] args) {
        // max()
        // 정수 2개를 받고, 더 큰 값 리턴
        // double형으로 받고, 더 큰 값 리턴

        System.out.println(getMax(3, 10));
        System.out.println(getMax(3.15, 1.12));

    }
}
