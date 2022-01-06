package broTutorials;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;


    MyFrame(){

        panel = new MyPanel();


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);//cor da frame background black

        //this.setSize(500,500);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);//centrar a janela


        this.setVisible(true);
    }

    /*
    //paint metodo override
    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;    //cast (Graphics2D) de g

        g2D.drawLine(0,0,500,500);
    }

     */
}
