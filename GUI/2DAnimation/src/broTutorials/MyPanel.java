package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    //const final width e height
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGH = 500;
    //imagens, inimigo, background,timer
    Image imgEnemy;
    Image imgBG;
    Timer timer;
    //velocidade de x, de y, posicao de x e y
    int xVelo = 5;      //valores diferentes em velocidade de x e y fazem a trajetoria aleatória
    int yVelo = 3;
    int x = 0;
    int y = 0;

    MyPanel(){

        //criar o painel com o tamanho dado nas variaveis acima
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGH));
        this.setBackground(Color.red);
        imgEnemy = new ImageIcon("img/enemy.png").getImage();
        imgBG = new ImageIcon("img/noite.jpg").getImage();

        //depois de 1 segundo = 1000 faz alguma acção
        timer = new Timer(10, this);
        timer.start();
        }


        public void paint(Graphics g) {
            //paint do background
            super.paint(g);

            Graphics2D g2D = (Graphics2D) g;
            //desenhar background
            g2D.drawImage(imgBG,0,0,null);
            //desenhar enemy no panel
            g2D.drawImage(imgEnemy,x,y,null);

        }
    @Override
    public void actionPerformed(ActionEvent e) {


        //if para quando chega ao limite (PANEL_WIDTH)- enemy.getWidth para enemy ficar sempre no panel
        if (x>=PANEL_WIDTH-imgEnemy.getWidth(null) || x<0){
            xVelo = xVelo * -1;
        }

        //mover imagem esquerda e direita
        x = x + xVelo;



        //if para quando chega ao limite (HEIGHT)- enemy.getHeigth para enemy ficar sempre no panel
        if (y>=PANEL_HEIGH-imgEnemy.getWidth(null) || y<0){
            yVelo = yVelo * -1;
        }

        //mover imagem cima e baixo
        y = y + yVelo;
        repaint();
    }
}

