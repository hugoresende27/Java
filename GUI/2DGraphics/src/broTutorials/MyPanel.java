package broTutorials;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image img ;

    MyPanel(){
        //getImage para ler a img
        img = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\dude.jpg").getImage();
        this.setPreferredSize(new Dimension(600,500));  //tamanho do painel
    }

    //paint metodo override
    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;    //cast (Graphics2D) de g
        Graphics2D teste = (Graphics2D) g;

        //adicionar imagem no topo, tudo o resto fica por cima
        g2D.drawImage(img,0,0,null);


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

        Graphics2D pokebola = (Graphics2D) g;
        pokebola.setPaint(Color.red);
        pokebola.fillArc(10,300,100,100,0,180);
        pokebola.setPaint(Color.yellow);
        pokebola.fillArc(10,300,100,100,180,180);

        //contruir poligno
        int [] xPoints = {150,250,350};
        int [] yPoints = {300,150,300};
        teste.setPaint(Color.blue);
        teste.drawPolygon(xPoints,yPoints,3);
        teste.setPaint(Color.red);
        teste.fillPolygon(xPoints,yPoints,3);

        g2D.setFont(new Font("Consolas",Font.BOLD,50));
        g2D.setPaint(Color.magenta);
        g2D.drawString("HELLO BRO!", 300 ,300);





    }
}
