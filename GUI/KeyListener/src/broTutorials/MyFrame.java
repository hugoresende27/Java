package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel lbl ;
    ImageIcon img = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\jogo1.png");

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





    @Override
    //quando uma letra é inserida, usa KeyChar, output char
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

    @Override
    //quando a tecla é pressionada, usa KeyCode, output int
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
    //quando a tecla é solta
    public void keyReleased(KeyEvent e) {
        System.out.println("keychar :: "+e.getKeyChar());
        System.out.println("keycode ->"+e.getKeyCode());

    }
}
