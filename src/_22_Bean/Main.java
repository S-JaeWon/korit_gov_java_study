package _22_Bean;

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("User");
        userEntity.setAge(15);
        userEntity.setEmail("user@naver.com");
        System.out.println(userEntity);

        /*
        * 게시글 엔티티
        * 게시물 아이디, 제목, 내용
        * 작성자 아이디 닉네임
        * 생성시각, 수정시각
        * */
        UserEntityLombok a = new UserEntityLombok();
        a.setUsername("재원");
        a.setAge(15);
        a.setUserId(1);
        a.setEmail("user@naver.com");
        System.out.println(a);

    }

}
