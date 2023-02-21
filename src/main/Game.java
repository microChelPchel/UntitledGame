package main;

import java.awt.Graphics;

public class Game implements Runnable {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    public Game () {
        gamePanel = new GamePanel(this);
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
    }

    public void render(Graphics g){

    }

    public void windowFocusLost() {

    }

    @Override
    public void run() {

    }

}
