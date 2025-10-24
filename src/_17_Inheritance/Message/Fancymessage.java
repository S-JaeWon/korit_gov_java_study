package _17_Inheritance.Message;

public class Fancymessage extends Message {

    public Fancymessage(String text) {
        super(text);
    }

    @Override
    public String makePreFix() {
        return "[FANCY] ";
    }

    @Override
    public String format() {
        return makePreFix() + "★" + super.getText() + "★";
    }

}
