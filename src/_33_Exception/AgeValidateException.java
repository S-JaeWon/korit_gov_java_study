package _33_Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidateException {

    public static void validateAge(int age) {
        if (age <= 0 || age >= 150) {
            throw new IllegalArgumentException("유효하지 않은 나이 | 입력값: " +  age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int age = scanner.nextInt();
            validateAge(age);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다. 숫자를 입력 해주세요.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("검증 종료");
        }
    }
}
