/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Hugo
 */
public class MyFrame extends JFrame implements KeyListener {

    JLabel lbl ;
    ImageIcon img = new ImageIcon("jogo1.png");

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        //add do keyListener
        this.addKeyListener(this);//ativar o keylistener

        //mudar a cor de fundo da frame
        this.getContentPane().setBackground(Color.black);

        //label
        lbl = new JLabel();
        lbl.setIcon(img);
        lbl.setBounds(0,0,100,100);
        //lbl.setBackground(Color.red);
        //lbl.setOpaque(true);


        this.add(lbl);

        this.setVisible(true);
    }
    



    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a':
                lbl.setLocation(lbl.getX()-15, lbl.getY());
                break;
            case 'd':
                lbl.setLocation(lbl.getX()+15, lbl.getY());
                break;
            case 'w':
                lbl.setLocation(lbl.getX(), lbl.getY()-15);
                break;
            case 's':
                lbl.setLocation(lbl.getX(), lbl.getY()+15);
                break;
        }
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37:
                lbl.setLocation(lbl.getX()-15, lbl.getY());
                break;
            case 39:
                lbl.setLocation(lbl.getX()+15, lbl.getY());
                break;
            case 38:
                lbl.setLocation(lbl.getX(), lbl.getY()-15);
                break;
            case 40:
                lbl.setLocation(lbl.getX(), lbl.getY()+15);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keychar :: "+e.getKeyChar());
        System.out.println("keycode ->"+e.getKeyCode());

    }
}

