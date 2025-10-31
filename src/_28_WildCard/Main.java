package _28_WildCard;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        Dog dog = new Dog();
        dogBox.setValue(dog);
        Box<Cat> catBox = new Box<>();
        catBox.setValue(new Cat());

        Unbounded.inspect(dogBox);
        Unbounded.inspect(catBox);

        Box<Corgi> corgiBox = new Box<>();
        corgiBox.setValue(new Corgi());
        UpperBounded.inspect(dogBox);
        UpperBounded.inspect(corgiBox);
//        UpperBounded.inspect(catBox); dog 및 자식 클래스 corgi 까지만
        System.out.println("----------------------------------");
        Box<Animal> animalBox = new Box<>();
        Box<Object> objectBox = new Box<>();

        LowerBounded.putDog(animalBox);
        LowerBounded.putDog(dogBox);
        LowerBounded.putDog(objectBox);
//        LowerBounded.putDog(corgiBox); dog 및 부모 클래스 animal, object 까지만

    }
}
