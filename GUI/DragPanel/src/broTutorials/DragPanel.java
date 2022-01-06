package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    //variaveis iniciadas
    ImageIcon img = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\fun.png");
    final int WIDTH = img.getIconWidth();
    final int HEIGHT = img.getIconHeight();
    Point imgCanto;
    Point prevPt;

    DragPanel(){

        imgCanto = new Point(0,0);
        //classe Clique instanciada
        Clique clik = new Clique();
        Drags drag = new Drags();

        //adicionar mouse listener aos objetos das classes click e drag
        this.addMouseListener(clik);
        this.addMouseMotionListener(drag);

    }


    //metodo para pintar
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        img.paintIcon(this,g,(int)imgCanto.getX(),(int)imgCanto.getY());
    }

    //class clique
    private class Clique extends MouseAdapter{

        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }

    //class arrastar rato
    private class Drags extends MouseMotionAdapter{

        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();

            imgCanto.translate( (int) (currentPt.getX() - prevPt.getX()),
                                (int) (currentPt.getY() - prevPt.getY()) );
            prevPt = currentPt;
            repaint();
        }
    }
}
