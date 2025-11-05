package _33_Exception;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}

public class Exception02 {
    public static void login(String id, String password) throws LoginFailedException {
        String correctId = "abc";
        String correctPassword = "abc123";

        if (!id.equals(correctId) || !password.equals(correctPassword)) {
            throw new LoginFailedException("일치하는 회원정보가 없습니다.");
        }
    }

    public static void main(String[] args) {
        String inputId = "abc";
        String inputPassword = "abc321";

        try {
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패: " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }

}
