package my.company.my.safarigame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {
    private GameView view;
    private SafariGameModel model; // Updated to use SafariGameModel

    public GameController(GameView view, SafariGameModel model) {  // Constructor updated to use SafariGameModel
        this.view = view;
        this.model = model;

        // Add action listeners to the buttons
        view.getStartButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
        view.getLoadButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadGame();
            }
        });
        view.getSettingsButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSettings();
            }
        });
        view.getExitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitGame();
            }
        });
    }

    private void startGame() {
        System.out.println("Game Started");
        // Handle game start logic
    }

    private void loadGame() {
        System.out.println("Game Loaded");
        // Handle loading game logic
    }

    private void openSettings() {
        System.out.println("Opening Settings");
        // Handle settings logic
    }

    private void exitGame() {
        System.out.println("Exiting Game");
        // Handle exit logic
        System.exit(0);
    }
}
