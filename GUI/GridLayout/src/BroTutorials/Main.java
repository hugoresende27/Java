package BroTutorials;

import javax.swing.*;
import java.awt.*;

/*
A GridLayout object places components in a grid of cells. Each component takes all the available space within its cell,
and each cell is exactly the same size. If the GridLayoutDemo window is resized, the GridLayout object changes the cell
size so that the cells are as large as possible, given the space available to the container.
 */
public class Main {

    public static void main(String[] args) {

        ////////////JFRAME
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(new GridLayout(2,2,10,10));

        ////////BOTÕES
        JButton btn1 = new JButton("1");

        frame.add(btn1);
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("666"));


        frame.setVisible(true);
    }
}
