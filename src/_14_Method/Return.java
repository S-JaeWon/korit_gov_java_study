package _14_Method;

public class Return {
    public static String getName() {
        String name = "재원";

        return name;
    }

    public static int getAge() {
        int age = 30;

        return age;
    }

    public static void main(String[] args) {
        // 반환값
        // void -> 반환값 x
        getName();

        String name = getName();

        System.out.println(name);
        System.out.println(getName());

        int age = getAge();
        System.out.println(age);
        System.out.println(getAge());
    }
}
