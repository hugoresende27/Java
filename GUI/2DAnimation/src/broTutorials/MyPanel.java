package broTutorials;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    //const final width e height
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGH = 500;
    //imagens, inimigo, background,timer
    Image imgEnemy;
    Image imgBG;
    Timer timer;
    //velocidade de x, de y, posicao de x e y
    int xVelo = 1;
    int yVelo = 1;
    int x = 0;
    int y = 0;

    MyPanel(){

        //criar o painel com o tamanho dado nas variaveis acima
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGH));
        this.setBackground(Color.black);
        imgEnemy = new ImageIcon("enemy.png").getImage();
        }

    }
}
