package _16_Class.Person;

// 접근제어자
/*
 * public -> 어디서든 접근 가능
 * protected -> 같은 패키지 또는 자식 클래스에서만 접근 가능
 * private -> 해당 클래스 내부에서만 접근가능
 * default -> 같은 패키지에서 접근 가능 (생략 가능)
 * ex) default void ~~~ = void ~~~
 * */
public class Person {
    public String name;
    protected String email;
    String address;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId () {
        return id;
    }

}
