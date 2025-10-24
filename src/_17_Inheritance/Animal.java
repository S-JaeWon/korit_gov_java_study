package _17_Inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

    Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    Animal() {

    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void move() {
        System.out.println(animalName + "이(가) 움직입니다.");
    }
}
