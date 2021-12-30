package adapter;

public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showParen() {
        System.out.println("(" + string + ")");
    }

    public void showAster() {
        System.out.println("*" + string + "*");
    }
}
