package main;

import gamestates.Gamestate;
import main.forms.LoginInForm;
import main.forms.SignupForm;

import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Game implements Runnable {

    private GameWindow gameWindow;
    private GamePanel gamePanel;

    private LoginInForm loginInForm;
    private SignupForm signupForm;


    public Game () {
        gamePanel = new GamePanel(this);
        loginInForm = new LoginInForm();
        signupForm = new SignupForm();
        List<JPanel> panels = new ArrayList<>();
        panels.add(gamePanel);
        panels.add(loginInForm);
        panels.add(signupForm);
        switchPanel(Gamestate.LOGIN);
        gameWindow = new GameWindow(panels);
        //???
        loginInForm.requestFocus();

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


    private void setFalseVisible(){
        gamePanel.setVisible(false);
        loginInForm.setVisible(false);
        signupForm.setVisible(false);
    }

    public void render(Graphics g){

    }

    public void windowFocusLost() {

    }

    @Override
    public void run() {

    }

}
