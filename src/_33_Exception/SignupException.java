package _33_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class SignupException {

    public static void signup(String username, int age) throws AgeRestrictionException {
        if (age < 15) {
            throw new AgeRestrictionException("유효하지 않은 나이 입니다.");
        }
        System.out.println(username + "님, 가입을 환영합니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("age: ");
            int inputAge = scanner.nextInt();
            signup(inputUsername, inputAge);
        } catch (AgeRestrictionException e) {
            System.out.println("회원가입 실패: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다. 숫자를 입력 해주세요");
        } finally {
            System.out.println("회원가입 처리 종료");
        }
    }
}
