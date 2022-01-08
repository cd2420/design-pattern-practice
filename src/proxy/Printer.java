package proxy;

public class Printer implements Printable {

    private String name;

    public Printer() {
        heavyJob("Printer의 인스턴스를 생성중");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer의 인스턴스 (" + name + ")를 생성중");
    }

    @Override
    public void setPrinterName(String name) {
        System.out.println("real : setPrinterName()");
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        System.out.println("real : getPrinterName()");
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name +" ===");
        System.out.println(string);

    }

    private void heavyJob(String s) {
        System.out.println(s);
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.print(".");
        }
        System.out.println("완료");

    }
}
