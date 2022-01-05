package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;



    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        //label
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        //adicionar o mouse listener à label
        label.addMouseListener(this);

        //adicionar o mouse listener à frame
        //this.addMouseListener(this);

        //this.setLocationRelativeTo(null);//centrar a janela
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CLICOU NO RATO");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("PRESSIONOU O RATO");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("SOLTOU O RATO");
        label.setBackground(Color.green);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("RATO DENTRO DA LABEL");
        label.setBackground(Color.black);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("RATO FORA DA LABEL");
        label.setBackground(Color.white);
    }
}
