package main;

import gamestates.Gamestate;
import gamestates.Menu;
import gamestates.Playing;
import main.forms.LoginInForm;
import main.forms.SignupForm;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Game implements Runnable {

    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private Thread gameThread;
    private final int FPS_SET = 120;
    private final int UPS_SET = 200;

    private Playing playing;
    private Menu menu;

    public final static int TILES_DEFAULT_SIZE = 32;
    public final static float SCALE = 2f;
    public final static int TILES_IN_WIDTH = 26;
    public final static int TILES_IN_HEIGHT = 14;
    public final static int TILES_SIZE = (int) (TILES_DEFAULT_SIZE * SCALE);

    //FORMS
    private LoginInForm loginInForm;
    private SignupForm signupForm;

    public Game () {
        initClasses();
//        List<JPanel> panels = new ArrayList<>();
//        panels.add(gamePanel);
//        panels.add(loginInForm);
//        panels.add(signupForm);
      //  switchPanel(Gamestate.LOGIN);
        gameWindow = new GameWindow(gamePanel);
        //???
        gamePanel.requestFocus();
        startGameLoop();
    }

    private void initClasses() {
        gamePanel = new GamePanel(this);
        loginInForm = new LoginInForm();
        signupForm = new SignupForm();

        //menu = new Menu(this);
        playing = new Playing(this);
    }

    private void switchPanel(Gamestate gamestate) {
        switch (gamestate){
            case LOGIN:
                setFalseVisible();
                loginInForm.setVisible(true);
                break;
            case REGISTRATION:
                setFalseVisible();
                signupForm.setVisible(true);
                break;
            //todo: все другие так
            default:
                setFalseVisible();
                gamePanel.setVisible(true);
                break;
        }

    }

    private void startGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    private void setFalseVisible(){
        gamePanel.setVisible(false);
        loginInForm.setVisible(false);
        signupForm.setVisible(false);
    }

    public void render(Graphics g){
        switch (Gamestate.state) {
//add menu later
            case PLAYING:
                playing.draw(g);
                break;
            default:
                break;
        }
    }

    private void update() {
        switch (Gamestate.state) {
//add menu later
            case PLAYING:
                playing.update();
                break;
            case OPTIONS:
            case QUIT:
            default:
                System.exit(0);
                break;
        }
    }

    @Override
    public void run() {

        double timePerFrame = 1000000000.0 / FPS_SET;
        double timePerUpdate = 1000000000.0 / UPS_SET;

        long previousTime = System.nanoTime();

        int frames = 0;
        int updates = 0;
        long lastCheck = System.currentTimeMillis();

        double deltaU = 0;
        double deltaF = 0;

        while (true) {
            long currentTime = System.nanoTime();

            deltaU += (currentTime - previousTime) / timePerUpdate;
            deltaF += (currentTime - previousTime) / timePerFrame;
            previousTime = currentTime;

            if (deltaU >= 1) {
                update();
                updates++;
                deltaU--;
            }

            if (deltaF >= 1) {
                gamePanel.repaint();
                frames++;
                deltaF--;
            }

            if (System.currentTimeMillis() - lastCheck >= 1000) {
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames + " | UPS: " + updates);
                frames = 0;
                updates = 0;

            }
        }

    }

    public void windowFocusLost() {

    }

}
