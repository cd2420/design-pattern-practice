package command;

public class Test {
    public static void main(String[] args) {
        Command koreanCommand = new KoreanCommand(new Korean());
        Command westernFoodCommand = new WesternFoodCommand(new WesternFood());

        RestaurantServer restaurantServer = new RestaurantServer();
        restaurantServer.setCommand(koreanCommand);
        restaurantServer.order();

        restaurantServer.setCommand(westernFoodCommand);
        restaurantServer.order();

    }
}
