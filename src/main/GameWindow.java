package main;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.List;

public class GameWindow {

    private JFrame jframe;

    public GameWindow(JPanel gamePanels) {

        jframe = new JFrame();

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  gamePanels.forEach(panel -> jframe.add(panel));
        jframe.add(gamePanels);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);
        jframe.addWindowFocusListener(new WindowFocusListener() {

            //TODO:????
            @Override
            public void windowLostFocus(WindowEvent e) {
                ((GamePanel)gamePanels).getGame().windowFocusLost();
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {

            }
        });

    }
}
