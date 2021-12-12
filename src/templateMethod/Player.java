package templateMethod;

public class Player {
    private PlayerLevel playerLevel;

    public Player() {
        this.playerLevel = new BeginnerLevel();
        this.playerLevel.showLevelMessage();
    }

    public void play(int num) {
        playerLevel.go(num);
    }

    public void upgradeLevel(PlayerLevel playerLevel){
        this.playerLevel = playerLevel;
        this.playerLevel.showLevelMessage();
    }

}
