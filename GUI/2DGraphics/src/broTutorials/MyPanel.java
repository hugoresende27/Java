package broTutorials;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));  //tamanho do painel
    }

    //paint metodo override
    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;    //cast (Graphics2D) de g
        Graphics2D teste = (Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));      //espessura da linha
        g2D.setPaint(Color.blue);                       //cor da linha ou do fill

        g2D.drawLine(0,0,500,500);      //draw line
        g2D.drawRect(10,10,100,200);    //desenha quadrado ou rectangulo
        g2D.fillRect(20,20,200,100);    //quadrado ou rectangulo preenchido
        //os ultimos itens a serem adicionados vão ficar sobrepostos sobre os anteriores

        teste.setPaint(Color.orange);
        teste.drawOval(300,300,150,150);
        teste.fillOval(200,200,100,100);

        g2D.setPaint(Color.yellow);
        g2D.drawArc(100,200,100,100,180,180);
        g2D.setPaint(Color.green);
        g2D.fillArc(400,100,150,150,50,200);

    }
}
