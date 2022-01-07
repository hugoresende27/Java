package broTutorials;

import javax.swing.*;

public class MyFrame  extends JFrame {

    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();
        this.setTitle("Hugo Resende Products @2022");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
