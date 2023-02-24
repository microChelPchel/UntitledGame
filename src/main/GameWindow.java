package main;

import utilz.LoadSave;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.List;

public class GameWindow {

    private JFrame jframe;
    //  private JLabel jlabel;

    // private ImageIcon image;
    public GameWindow(JPanel gamePanels) {

        //   Image img = new ImageIcon("background.png").getImage();
        //  jlabel = new JLabel(image);
        //  jlabel.setSize(650,450);
        jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //  gamePanels.forEach(panel -> jframe.add(panel));
        jframe.add(gamePanels);
        //  jframe.add(jlabel);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);
        jframe.addWindowFocusListener(new WindowFocusListener() {

            //????
            @Override
            public void windowLostFocus(WindowEvent e) {
                ((GamePanel) gamePanels).getGame().windowFocusLost();
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {

            }
        });

    }
}
