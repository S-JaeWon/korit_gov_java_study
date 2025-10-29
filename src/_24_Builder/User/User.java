package _24_Builder.User;

/*
* 필드가 비어 있다면 해당 필드가 비어있다고 출력
* */

public class User {
    private int userId;
    private String username;
    private String password;
    private String email;

    private User(Builder builder) {
        this.userId = builder.userId;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
    }

    public static class Builder {
        private int userId;
        private String username;
        private String password;
        private String email;

        public Builder userId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {

            this.password = password;

            return this;
        }

        public Builder email(String email) {
            if(email == null || !email.contains("@")){
                System.out.println("이메일 형식이 아닙니다.");
            } else {
                this.email = email;
            }
            return this;
        }

        public User build() {
            if((username == null || username.isBlank()) || (password == null || password.isBlank())) {
                System.out.println("username 혹은 password 필드 값이 비어 있습니다.");
            }
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User(userId = " + userId + ", username = " + username + ", password = " + password + ", email = " + email + ")";
    }
}
