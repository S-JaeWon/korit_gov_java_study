package _22_Bean;

/*
* Bean
* 필드 속성들을 property 라고 함, 해당 property들은 private으로 캡슐화가 되어야 함
* 그리고 getter 와 setter로 만 접근 가능, 이때 getter 와 setter 는 public
* */

public class UserEntity {
    private int userId;
    private String username;
    private int age;
    private String email;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(userId = " + userId + ", username = " + username + ", age = " + age + ", email = " + email + ")";
    }

    // Entity
    // DB의 테이블과 1:1 매핑 되는 클래스
    // 자바 객체 <-> 테이블 간 데이터
    // Bean -> 일종의 명세, 가이드라인
}
