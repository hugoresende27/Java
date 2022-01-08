package broTutorials;
/*
An object which has no reference variable is called anonymous object in Java.
Anonymous means nameless.  If you want to create only one object in a class then the anonymous object is a good approach.
objeto anonimo é um objeto sem nome
 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        //arraylist do tipo JLabel
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        ImageIcon AS = new ImageIcon("img/A_spades.png");
        JLabel asLbl = new JLabel(AS);
        deck.add(asLbl);


        frame.add(deck.get(0));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720,720);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
