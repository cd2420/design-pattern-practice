package command;

public class RestaurantServer {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void order() {
        command.execute();
    }
}
