package my.company.my.safarigame;

public class SafariGame {
    public static void main(String[] args) {
        // Create view and controller
        GameView gameView = new GameView();
        SafariGameModel model = new SafariGameModel(); // Assuming you have this class for the game logic
        GameController controller = new GameController(gameView, model);  // Pass view and model to controller
        
        // Make the frame visible
        gameView.getFrame().setVisible(true); // Make the frame visible
    }
}
