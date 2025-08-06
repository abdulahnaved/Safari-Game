package my.company.my.safarigame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameView {
    private JFrame frame;
    private JButton startButton;
    private JButton loadButton;
    private JButton settingsButton;
    private JButton exitButton;
    private Font customFont;  // Declare a font variable

    private JPanel currentPanel;

    // List to simulate saved game states
    private List<String> savedGames;

    public GameView() {
        // Set the default funky font ("Comic Sans MS")
        customFont = new Font("Comic Sans MS", Font.PLAIN, 24); // You can adjust the size

        // Initialize saved game states (dummy data for now)
        savedGames = new ArrayList<>();
        savedGames.add("Saved Game 1");
        savedGames.add("Saved Game 2");
        savedGames.add("Saved Game 3");

        // Create frame
        frame = new JFrame("Safari Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Fullscreen mode
        frame.setUndecorated(true); // Optional: Remove title bar if you want full-screen without borders

        // Set the first screen as the main game screen
        currentPanel = createMainGamePanel();
        frame.add(currentPanel);

        // Make the frame visible
        frame.setLocationRelativeTo(null);  // Center on the screen
        frame.setVisible(true);
    }

    // Method to create the main game screen
    private JPanel createMainGamePanel() {
        // Create a main panel with BorderLayout for title and GridBagLayout for buttons
        JPanel panel = new JPanel(new BorderLayout(20, 20)); 

        // Title label at the top with a funky font style
        JLabel titleLabel = new JLabel("Safari Game", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 80));  // Larger font size for title
        titleLabel.setForeground(new Color(255, 165, 0));  // Safari Orange color

        // Create a panel for the title with more padding at the top
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.add(titleLabel, BorderLayout.CENTER);
        titlePanel.setPreferredSize(new Dimension(frame.getWidth(), 150)); // Adjust this as needed
        titlePanel.setMaximumSize(new Dimension(frame.getWidth(), 200)); // Maximum height, can increase/decrease

        // Add title panel to the top of the main panel
        panel.add(titlePanel, BorderLayout.NORTH);

        // Create buttons with consistent style
        startButton = createButton("Start Game");
        loadButton = createButton("Load");
        settingsButton = createButton("Settings");
        exitButton = createButton("Exit");

        // Add action listener for Load button to go to the Load Game screen
        loadButton.addActionListener(e -> switchToLoadGamePanel());

        // Add action listener for Exit button to close the game
        exitButton.addActionListener(e -> exitGame());

        // Create a panel to hold the buttons and use GridBagLayout for centering
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;  // Place buttons in column 0
        gbc.gridy = 0;  // Start at row 0
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Allow buttons to expand horizontally

        // Add buttons to the buttonPanel with GridBagConstraints
        buttonPanel.add(startButton, gbc);
        gbc.gridy++;
        buttonPanel.add(loadButton, gbc);
        gbc.gridy++;
        buttonPanel.add(settingsButton, gbc);
        gbc.gridy++;
        buttonPanel.add(exitButton, gbc);

        // Center the button panel in the middle of the screen
        panel.add(buttonPanel, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createLoadGamePanel() {
    // Create the panel for the load game screen
    JPanel panel = new JPanel(new BorderLayout(20, 20)); 

    // Title label at the top with a funky font style
    JLabel titleLabel = new JLabel("Load Game", SwingConstants.CENTER);
    titleLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 80));  // Larger font size for title
    titleLabel.setForeground(new Color(255, 165, 0));  // Safari Orange color

    // Add title label to the top of the panel
    panel.add(titleLabel, BorderLayout.NORTH);

    // Create a panel for the list of saved games
    JPanel gameListPanel = new JPanel();
    gameListPanel.setLayout(new BoxLayout(gameListPanel, BoxLayout.Y_AXIS));
    gameListPanel.setAlignmentX(Component.CENTER_ALIGNMENT);  // Center the game list panel

    // Add saved game buttons (using dummy saved game data for now)
    for (String savedGame : savedGames) {
        JButton gameButton = createButton(savedGame);
        gameButton.addActionListener(e -> loadGame(savedGame));  // Add action to load a saved game
        gameListPanel.add(gameButton);
    }

    // Add the game list panel to the center of the load game panel
    panel.add(gameListPanel, BorderLayout.CENTER);

    // Create the Back button at the bottom
    JButton backButton = createButton("Back");
    backButton.addActionListener(e -> switchToMainGamePanel());

    // Center the Back button by using FlowLayout
    JPanel backPanel = new JPanel();
    backPanel.setLayout(new FlowLayout(FlowLayout.CENTER));  // Center-align the back button
    backPanel.add(backButton);

    // Add the back panel to the bottom
    panel.add(backPanel, BorderLayout.SOUTH);

    return panel;
}



    // Method to switch to the Main Game screen
    private void switchToMainGamePanel() {
        // Switch the current panel to the Main Game screen
        frame.getContentPane().removeAll();
        frame.add(createMainGamePanel());
        frame.revalidate();
        frame.repaint();
    }

    // Method to simulate loading a game
    private void loadGame(String savedGame) {
        JOptionPane.showMessageDialog(frame, "Loading " + savedGame);
        // Add actual game loading logic here in the future
    }

    // Method to switch to the Load Game screen
    private void switchToLoadGamePanel() {
        // Switch the current panel to the Load Game screen
        frame.getContentPane().removeAll();
        frame.add(createLoadGamePanel());
        frame.revalidate();
        frame.repaint();
    }

    // Method to exit the game
    private void exitGame() {
        System.exit(0);  // This will close the application
    }

    // Helper method to create buttons with consistent style and size
    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(customFont);  // Use the funky font
        button.setBackground(new Color(255, 165, 0));  // Safari Orange color
        button.setForeground(Color.WHITE);
        button.setPreferredSize(new Dimension(300, 70)); // Same size for all buttons, adjust size as needed
        button.setAlignmentX(Component.CENTER_ALIGNMENT);  // Center align the button in the panel

        // Add space between buttons by setting the insets
        button.setMargin(new Insets(10, 10, 10, 10)); // Add padding inside the button

        return button;
    }

    // Getter methods for buttons
    public JButton getStartButton() {
        return startButton;
    }

    public JButton getLoadButton() {
        return loadButton;
    }

    public JButton getSettingsButton() {
        return settingsButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    // Getter for the frame
    public JFrame getFrame() {
        return frame;
    }
}
