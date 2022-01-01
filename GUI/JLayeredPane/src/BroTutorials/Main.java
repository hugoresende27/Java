package BroTutorials;
/*
DEFAULT -> PALETTE -> MODAL -> POPUP -> DRAG
 */

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //////JLAYREDPANE
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        /////JLABELS
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(Color.gray);
        label4.setBounds(270,270,100,100);

        JLabel label5 = new JLabel();
        label5.setOpaque(true);
        label5.setBackground(Color.black);
        label5.setBounds(70,70,100,100);

        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
        layeredPane.add(label4, Integer.valueOf(0));
        layeredPane.add(label5, Integer.valueOf(2));




        /////JFRAME
        JFrame frame = new JFrame("JLayredPane");

        frame.add(layeredPane);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
