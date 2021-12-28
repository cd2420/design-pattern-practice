package decorator;

public class Test {

    public static void main(String[] args) {
        Coffee starbucks = new StarBucks();
        Coffee starbucks_americano = new Americano(starbucks);
        starbucks_americano.brewing();
        System.out.println();

        Coffee angel_in_us = new AngelInUs();
        Coffee angel_in_us_Latte = new Latte(angel_in_us);
        angel_in_us_Latte.brewing();
        System.out.println();

        Latte starbucks_americano_latte = new Latte(starbucks_americano);
        starbucks_americano_latte.brewing();
        System.out.println();

        WhippedCream angel_in_us_Latte_add_whipping = new WhippedCream(new Latte(new AngelInUs()));
        angel_in_us_Latte_add_whipping.brewing();
        System.out.println();
    }
}
