package _16_Class.Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    // alt + Int -> 생성자, getter, setter 자동완성
    Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름: " + name + "\n" + "나이: " + age + "\n" + "메일: " + email + "\n" + "주소: " + address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
