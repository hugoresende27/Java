package broTutorials;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        /*

        CRIAR UMA JFRAME PARTE1

        JFrame frame = new JFrame();    //cria uma frame
        frame.setVisible(true); //frame VISIBLE TRUE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para fechar e parar de correr no background
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//o botão de fechar do nothing


        ////////////TITULO
        frame.setTitle("Minha primeira janela em JAVA");

        ///////////DIMENSÕES
        frame.setSize(420,420);
        frame.setResizable(false);  //tamanho fixo

        /////////LOGO DA JANELA
        ImageIcon img = new ImageIcon("hr_logo.png");//criar icone
        frame.setIconImage(img.getImage());     //setIconImage usa objeto img com metodo .getImage()

        ///////////COR DE FUNDO BACKGROUND COLOR
        //frame.getContentPane().setBackground(Color.red);
        frame.getContentPane().setBackground(new Color(123,55,178));
        //frame.getContentPane().setBackground(new Color(0xFFFFFF));

        */

        //CRIAR UMA JFRAME PARTE2

        //myFrame frame1 = new myFrame();
        new myFrame(); //tbm funciona, se apenas for usar 1
    }
}
