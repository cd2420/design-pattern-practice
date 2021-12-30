package adapter;

public class PrintBanner implements Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void stringWeak() {
        banner.showAster();
    }

    @Override
    public void stringStrong() {
        banner.showParen();
    }
}
