package _19_Interface.ZooKeeper;

public class Zookeeper {
//    public void feed(Tiger tiger) {
//        System.out.println("소고기를 던져준다.");
//    }
//    public void feed(Lion lion) {
//        System.out.println("닭고기를 던져준다.");
//    }

    public void feed(Predator predator) {
        System.out.println(predator.getFood() + "를 던져준다.");
    }
}
