package _15_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) {
        return (int) (doubleNum * doubleNum);
    }

    public static void printInfo(String name) {
        System.out.println("제 이름은 " + name + " 입니다.");
    }

    public static void printInfo(String name, int age) {
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + " 입니다.");
    }

    public static void printInfo(String name, int age, String email) {
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "이며, " + "제 이메일은 " + email + "입니다.");
    }

    public static void main(String[] args) {
        // 메서드 오버로딩
        // 같은 이름을 가진 메소드를 여러개 선언
        // 전달값(파라미터)의 타입이 다르거나, 개수가 달라야함.
        // return 값은 같아도 됨

        // printInfo()
        // 문자열을 받아서 출력
        // 문자열, 정수 나이 출력
        // 문자열, 정수 나이, 문자열 이메일 출력

        printInfo("심재원");
        printInfo("심재원", 30);
        printInfo("심재원", 30, "user@naver.com");
    }
}
