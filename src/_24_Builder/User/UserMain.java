package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user = new User.Builder()
                .userId(1)
                .username("철수")
                .password("q1w2e3")
                .email("user@naver.com")
                .build();


    }
}
