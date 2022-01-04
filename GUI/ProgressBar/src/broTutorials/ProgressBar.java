package broTutorials;

import javax.swing.*;
import java.awt.*;

public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar barra = new JProgressBar(0,500);
    JProgressBar barra2 = new JProgressBar();

    ProgressBar(){

        barra.setValue(0);
        barra.setBounds(0,0,420,50);
        barra.setStringPainted(true);   //para aparecer o 0%
        barra.setFont(new Font("MV Boli", Font.BOLD,25));   //font da barra
        barra.setForeground(Color.red);               //cor da barra cheia
        barra.setBackground(Color.black);             //cor da barra vazia

        barra2.setValue(0);
        barra2.setBounds(0,50,420,50);
        barra2.setStringPainted(true);
        barra2.setFont(new Font("MV Boli", Font.BOLD,25));
        barra2.setForeground(Color.green);
        barra2.setBackground(Color.blue);

        frame.add(barra);
        frame.add(barra2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,600);
        frame.setLayout(null);      //layout manager null

        frame.setVisible(true);

        fill(); //para encher a barra
        fill2();

    }

    private void fill2() {

        int c = 0;
        while (c<=100){
            barra2.setValue(c);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            c += 10;
        }
        barra2.setString("COMPLETO");
    }

    private void fill() {
        //para encher a barra, metodo fill() com um ciclo while, Thread.sleep dentro do try catch
        int count = 500;
        while (count >0){

            barra.setValue(count);
            try {
                Thread.sleep(20);     //tempo para cada iteração
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count -= 10;    //valor que anda em cada iteração
        }
        barra.setString("GAME OVER");
    }
}
