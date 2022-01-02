package observer;

public class DigitObserver implements Observer{
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("DigitObserver : ");
        int count = numberGenerator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){

        }

    }
}
