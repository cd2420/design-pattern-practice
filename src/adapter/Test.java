package adapter;

public class Test {

    public static void main(String[] args) {
        Print p = new PrintBanner("hello world");
        p.stringWeak();
        p.stringStrong();
    }
}
