package gamestates;

import entities.Player;
import main.Game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Playing extends State implements Statemethods {

    private Player player;


    private int xLvlOffset = 0;

    public Playing(Game game) {
        super(game);
        initClasses();
    }


    @Override
    public void update() {
        //add later pause
        player.update();
    }

    public void draw(Graphics g) {
        player.render(g, xLvlOffset);
    }

    private void initClasses() {
        player = new Player(200, 200, (int) (60 * Game.SCALE), (int) (40 * Game.SCALE));
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
