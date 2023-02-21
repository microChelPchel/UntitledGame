package main;

import main.forms.LoginInForm;
import main.forms.SignupForm;

import javax.swing.*;
import java.awt.Graphics;

public class Game implements Runnable {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    private LoginInForm loginInForm = new LoginInForm();
    private SignupForm signupForm = new SignupForm();


    public Game () {
        //gamePanel = new GamePanel(this);

        JPanel current = loginInForm;
        gameWindow = new GameWindow(current);
        current.requestFocus();
    }

    public void render(Graphics g){

    }

    public void windowFocusLost() {

    }

    @Override
    public void run() {

    }

}
