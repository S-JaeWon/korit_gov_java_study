package _16_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("재원", 30, "user@naver.com", "남구");
//        student1.name = "재원";
//        student1.age = 30;
//        student1.email = "user@naver.com";
//        student1.address = "남구";

        student1.setName("철수");

        student1.showInfo();

        System.out.println(student1.getName());
    }
}
