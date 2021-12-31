
package broTutorials;

//JPANEL = gui component para conter outros components

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ///////////IMAGEICON
        ImageIcon icone = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\fixe.png");

        /////////CRIAR UMA LABEL
        JLabel label1 = new JLabel();
        label1.setText("OLÁ HUGO!");
        label1.setIcon(icone);      //adicionar imagem ao label1
        label1.setVerticalAlignment(JLabel.BOTTOM);
        label1.setHorizontalAlignment(JLabel.RIGHT);
        label1.setBounds(50,50,355,105);


        //////////CRIAR JPANEL RED
        JPanel painelR = new JPanel();
        painelR.setBackground(Color.red);
        painelR.setBounds(0,0,250,250);

        painelR.setLayout(null);

        //////////CRIAR JPANEL BLUE
        JPanel painelB = new JPanel();
        painelB.setBackground(Color.blue);
        painelB.setBounds(250,0,250,250);

        painelB.setLayout(null);

        //////////CRIAR JPANEL VERDE
        JPanel painelV = new JPanel();
        painelV.setBackground(Color.green);
        painelV.setBounds(0,250,500,250);

        painelV.setLayout(null);

        //////////CRIAR JPANEL BLACK
        //JPanel painelBL = new JPanel();
        //painelBL.setBackground(Color.black);
        //painelBL.setBounds(500,0,200,200);


        ///////////CRIAR UMA FRAME
        JFrame janelaA = new JFrame();
        janelaA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaA.setLayout(null);
        janelaA.setSize(750,500);
        janelaA.setVisible(true);

        //ADICIONAR LABEL AO PAINEL AQUI
        painelV.add(label1);
        //painelR.add(label1);        //adicionar label1 ao painel
        //painelB.add(label1);

        janelaA.add(painelR); //ADICIONAR PAINELRed
        janelaA.add(painelB); //ADICIONAR PAINELBlue
        janelaA.add(painelV); //ADICIONAR PAINELVerde
        //janelaA.add(painelBL); //ADICIONAR PAINELBLack
    }
}


