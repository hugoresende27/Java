package broTutorials;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    ////CRIAR UMA JFRAME PARTE2 CLASSE myFrame com extends JFrame, metodo construtor myFrame

    myFrame(){

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Minha primeira janela em JAVA");

        this.setSize(420,420);
        this.setResizable(false);  //tamanho fixo

        ImageIcon img = new ImageIcon("hr_logo.png");
        this.setIconImage(img.getImage());

        this.getContentPane().setBackground(new Color(123,55,178));

    }
}
