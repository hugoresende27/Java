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

        /*
        //adiciona as de espadas ao deck
        ImageIcon AS = new ImageIcon("img/0.png");
        JLabel asLbl = new JLabel(AS);
        deck.add(asLbl);

        //adiciona rei de espadas ao deck
        ImageIcon KS = new ImageIcon("img/1.png");
        JLabel ksLbl = new JLabel(KS);
        deck.add(ksLbl);
         */

        //metodo objeto anonimo
        for (int i =0; i<10; i++){
            deck.add(new JLabel(new ImageIcon("img/"+i+".png")));
            frame.add(deck.get(i));
        }



        //adicionar cartas à frame
        //frame.add(deck.get(1));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,800);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
