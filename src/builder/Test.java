package builder;

public class Test {

    public static void main(String[] args) {
        Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                                    .addTopping(Pizza.Topping.CHEEZE)
                                    .addTopping(Pizza.Topping.POTATO)
                                    .build();

        Pizza calzone = new Calzone.Builder()
                                    .addTopping(Pizza.Topping.POTATO)
                                    .addTopping(Pizza.Topping.CHEEZE)
                                    .sauceInsde()
                                    .build();

        System.out.println(nyPizza);
        System.out.println(calzone);
    }

}
