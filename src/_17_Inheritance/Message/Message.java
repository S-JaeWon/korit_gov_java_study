package _17_Inheritance.Message;

public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    protected String makePreFix() {
        return "[MSG] ";
    }

    public String format() {
        return makePreFix() + text;
    }

    public void print() {
        System.out.println(format());
    }
}
