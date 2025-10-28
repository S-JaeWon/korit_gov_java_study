package _21_Objects;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("재원", "국어");
        Teacher teacher2 = new Teacher("재원", "국어");

        System.out.println(teacher1);
        System.out.println(teacher1.equals(teacher2)); // 둘의 해시코드 비교
        System.out.println(teacher1.equals(teacher1));
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        // equals() 오버라이드시 hashCode() 도 반드시 재정의 해줘야 함. 하지만 역은 상관 x

    }
}
