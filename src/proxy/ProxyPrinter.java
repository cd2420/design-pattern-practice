package proxy;

public class ProxyPrinter implements Printable {

    private String name;
    private Printer real;

    public ProxyPrinter(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        System.out.println("proxy: setPrinterName()");
        this.name = name;

    }

    @Override
    public String getPrinterName() {
        System.out.println("proxy: getPrinterName()");
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
