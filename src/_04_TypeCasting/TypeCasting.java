package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // 정수 -> 실수
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);

        // 실수 -> 정수
        float scoreFloat = 98.1F;
        System.out.println((int) scoreFloat);

        double scoreDouble = 98.2;
        System.out.println((int) scoreDouble);

        double sum1 = /*(double) */98 + 77.3; // 자동 형변환
        System.out.println(sum1);

        int sum2 = 98 + (int) 77.3;
        System.out.println(sum2);

        float sum3 = 98 + 77.3F;

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int) scoreFloat; // double -> int 자동 형변환 x

        long scoreLong = 87L;
        convertedScoreInt = (int) scoreLong;

        float convertedScoreFloat = scoreInt;
        System.out.println(convertedScoreFloat);

        // 숫자 -> 문자열
        int num1 = 55;
        String strNum1 = String.valueOf(num1);
        strNum1 = Integer.toString(num1);
        System.out.println(strNum1);

        double num2 = 55.55;
        String strNum2 = String.valueOf(num2);
        strNum2 = Double.toString(num2);
        System.out.println(num2);

        float num3 = 51.234F;
        String strNum3 = String.valueOf(num3);
        strNum3 = Float.toString(num3);
        System.out.println(num3);

        // 문자열 -> 숫자
        int i = Integer.parseInt("34");
        double d = Double.parseDouble("34.44");
        float f = Float.parseFloat("55.555F");
        // i = Integer.parseInt("숫자");

        float floatNumber = 3.121212F;
        System.out.println((int) floatNumber);
        int num = (int) floatNumber;
        System.out.println(num);
    }
}
