package _19_Interface.TVRemoteController;

/*
* extends 단일 상속
* implements 다중 상속
* */

public abstract class Button implements Press, Up, Down {
    @Override
    public abstract void onPressed(); // 버튼에서 '누른다'는 핵심 기능이므로 추상 메서드로 정의

    public void onUp() {}

    public void onDown() {}

}
