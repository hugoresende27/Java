package broTutorials;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

public class GamePanel extends JPanel implements ActionListener {





    //medidas////////////////////
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;  //tamanho das unidades
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT/UNIT_SIZE);
    static int DELAY = 50;
    int vel;

    //arrays de coordenadas /////////////////
    final int x[]= new int [GAME_UNITS];
    final int y[]= new int [GAME_UNITS];

    // tamanho inicial cobra /////
    int bodyParts = 6;

    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';   //RIGHT LEFT UP DOWN
    boolean running = false;
    Timer timer;
    Random random;




    //CONSTRUCTOR/////////////////////////////////
    GamePanel(){

        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());


        startGame();
    }



    //START GAME //////////////////////////////////
    public void startGame(){

        vel = startMenu();
        newApple();
        running= true;
        timer = new Timer(vel,this);
        timer.start();
        System.out.println(vel);

    }

    //PAINT////////////////////////////////////////
    public void paintComponent (Graphics g){

        super.paintComponent(g);
        draw(g);
    }

    //DRAW////////////////////////////////////////
    public void draw (Graphics g) {
        if (running) {

/*/////////////GRID LINES
            for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
                //desenhar linhas no x
                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                //desenhar linhas no y
                g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
            }
*/
            //g.setColor(Color.red);
            g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            //desenhar ma??a no ecr??
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    //g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));//gerar cores aleat??rias
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            // TEXTO DA PONTUA????O //////////////////
            g.setColor(Color.red);
            g.setFont(new Font("Consolas",Font.BOLD,25));
            //alinhar texto ao centro
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: "+applesEaten,(SCREEN_WIDTH-metrics.stringWidth("Score: "+applesEaten))/2,g.getFont().getSize());
        }
        else {
            gameOver(g);
        }
    }

    //NEW APPLE///////////////////////////////////
    public void newApple   () {
        //gerar ma??as aleat??riamente
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }

    //MOVE///////////////////////////////////////
    public void move(){
        //loop para criar cobra com tamanho inicial = bodyParts
        for (int i= bodyParts; i>0;i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        // switch case para dire????o da cobra
        switch (direction){
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }

    //COMER APPLE//////////////////////////////////////
    public void checkApple(){
        if((x[0] == appleX) && (y[0] == appleY )){//se coordenadas iguais
            bodyParts++;        //aumenta bodyparts
            applesEaten++;      //aumenta applesEaten
            newApple();         //gerar nova ma??a
            vel += 5;
        }
    }

    //COLISIONS//////////////////////////////////
    public void checkCollisions(){
        //verificar se cabeca colide com o corpo
        for (int i= bodyParts; i>0; i--){
            if ((x[0] == x[i] )&& (y[0] == y[i])){
                running = false;
            }
        }

        //verificar se toca na margem esquerda
        if (x[0] < 0){
            running = false;
        }

        //verificar se toca na margem direita
        if (x[0] > SCREEN_WIDTH-UNIT_SIZE){
            running = false;
        }

        //verificar se toca na margem superior
        if (y[0] < 0){
            running = false;
        }

        //verificar se toca na margem inferior
        if (y[0] > SCREEN_HEIGHT-UNIT_SIZE){
            running = false;
        }

        //se tocar nalguma margem, stop
        if (!running) {
            timer.stop();
        }
    }

    //GAMEOVER///////////////////////////////////
    public void gameOver(Graphics g){
        //mostrar a score
        g.setColor(Color.red);
        g.setFont(new Font("Consolas",Font.BOLD,25));
        //alinhar texto ao centro
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: "+applesEaten,(SCREEN_WIDTH-metrics1.stringWidth("Score: "+applesEaten))/2,g.getFont().getSize());

        //mostrar o texto gameover
        g.setColor(Color.red);
        g.setFont(new Font("Consolas",Font.BOLD,75));
        //alinhar texto ao centro
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over",(SCREEN_WIDTH-metrics2.stringWidth("Game Over"))/2,SCREEN_HEIGHT/2);

        String message = "Score : "+applesEaten+"\nTentar de novo?";
        String title = "Game Over";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION){
            new GameFrame();
        } else {
            System.exit(0);
        }

    }

    //startMenu///////////////////////////////////
    public int startMenu(){

        //SHOWOPTION DIALOG tudo num s??

        Integer[] velocidade = { 25, 50, 75, 100, 125, 150 ,175,200,225,250};

        Integer input = (Integer) JOptionPane.showInputDialog(null, "Escolha a velocidade",
                "Snake Game Settings", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                velocidade, // Array of choices
                velocidade[1]); // Initial choice
        int velocidadeFinal;
        switch (input){
            case 25:
                velocidadeFinal = 250;
                break;
            case 50:
                velocidadeFinal = 200;
                break;
            case 75:
                velocidadeFinal = 175;
                break;
            case 100:
                velocidadeFinal = 150;
                break;
            case 125:
                velocidadeFinal = 125;
                break;
            case 150:
                velocidadeFinal = 100;
                break;
            case 175:
                velocidadeFinal = 75;
                break;
            case 200:
                velocidadeFinal = 50;
                break;
            case 225:
                velocidadeFinal = 25;
                break;
            case 250:
                velocidadeFinal = 10;
                break;
            default:
                velocidadeFinal = 100;
                break;
        }
        return velocidadeFinal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (running){
            move();
            checkApple();
            checkCollisions();
        }

        repaint();




    }

    //class KEYADAPTER para ler o input das teclas switch case e.getKeyCode
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    if (direction != 'R'){
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L'){
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D'){
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U'){
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}
