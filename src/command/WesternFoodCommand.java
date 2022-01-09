package command;

public class WesternFoodCommand implements Command {

    private WesternFood westernFood;

    public WesternFoodCommand(WesternFood westernFood) {
        this.westernFood = westernFood;
    }

    @Override
    public void execute() {
        westernFood.serve();
    }
}
