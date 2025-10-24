package _17_Inheritance;

public class Human extends Animal {

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getAnimalName(){
        System.out.println("제 이름은 " + super.getAnimalName() + " 입니다.");
        return super.getAnimalName();
    }

    @Override
    public int getAnimalAge() {
        System.out.println("제 나이는" + super.getAnimalAge() + "살 입니다.");
        return super.getAnimalAge();
    }

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void read(String bookName) {
        System.out.println(bookName + "을 읽는 중 입니다.");
    }
}
