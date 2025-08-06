package my.company.my.safarigame;

public class SafariGameModel {
    private int score;
    private String gameState;

    public SafariGameModel() {
        this.score = 0;
        this.gameState = "Not Started";
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        this.score += 10;
    }

    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }
}
