package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;


    Game(){

        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setBackground(Color.black);
        

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,100,100);//quadrado
        label.setOpaque(true);


        frame.add(label);

        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
