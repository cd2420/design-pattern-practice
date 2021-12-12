package templateMethod;

public class Test {

    public static void main(String[] args) {
        Player player = new Player();
        player.play(3);

        player.upgradeLevel(new AdvancedLevel());
        player.play(5);

        player.upgradeLevel(new SuperLevel());
        player.play(7);

    }
}
