package templateMethod;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프할 줄 모름.");
    }

    @Override
    public void turn() {
        System.out.println("turn 할줄 모름.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 초보자 레벨 입니다. *****");
    }
}
