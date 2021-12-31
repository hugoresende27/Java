package broTutorials;

//JLABEL = a gui display area para texto imagem ou ambos

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //CRIAR UMA JFRAMA
        JFrame janela1 = new JFrame();                              //NEW JFRAME
        janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //DEFAULT EXIT ON CLOSE
        janela1.setSize(500,500);                       //SET SIZE
        janela1.setVisible(true);                                   //SET VISIBLE TRUE
    }
}
