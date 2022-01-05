package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame2 extends JFrame implements MouseListener {

    ImageIcon smile;
    ImageIcon nerv;
    ImageIcon dor;
    ImageIcon tonto;
    JLabel lbl;

    MyFrame2(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        smile = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\smile.png");
        nerv = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\nervos.png");
        dor = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\fun.png");
        tonto = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\dizzi.png");

        lbl = new JLabel();
        lbl.setIcon(smile);
        lbl.addMouseListener(this);//ativar o mouse listener


        this.add(lbl);

        this.pack();
        //centrar a janela
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        lbl.setIcon(dor);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lbl.setIcon(tonto);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        lbl.setIcon(nerv);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        lbl.setIcon(smile);
    }
}
