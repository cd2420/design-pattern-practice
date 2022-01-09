package command;

public class KoreanCommand implements Command {

    private Korean korean;
    public KoreanCommand(Korean korean) {
        this.korean = korean;
    }

    @Override
    public void execute() {
        korean.serve();
    }
}
