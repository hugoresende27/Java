package broTutorials;

//JLABEL = a gui display area para texto imagem ou ambos

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //CRIAR UMA JFRAME
        JFrame janela1 = new JFrame();                              //NEW JFRAME
        janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //DEFAULT EXIT ON CLOSE
        //janela1.setSize(600,600);                       //SET SIZE


        //LOGO
        ImageIcon img = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\hr_logo.png");
        janela1.setIconImage(img.getImage());

        //CRIAR  JLABEL
        JLabel txt1 = new JLabel();
        txt1.setText("Isto vai ser o texto da label");
        //JLabel txt2 = new JLabel("Etiqueta 2");

        //ADICIONAR À JFRAME A JLABEL
        janela1.add(txt1);
        //janela1.add(txt2);

        //CRIAR UMA IMAGEMICON E ADICIONAR À LABEL
        ImageIcon imagem = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\snake.jpg");
        txt1.setIcon(imagem);

        //CRIAR UMA BORDER
        Border borda = BorderFactory.createLineBorder(Color.green,5);
        txt1.setBorder(borda);

        txt1.setHorizontalTextPosition(JLabel.CENTER);      //vai centrar o texto de txt1 ao centro da imagemicon
        txt1.setVerticalTextPosition(JLabel.TOP);           //vai colocar o texto no topo da imagem
        txt1.setForeground(Color.green);                      //cor do texto a vermelho
        txt1.setFont(new Font("MV Boli",Font.BOLD,50));//muda o font, font-style e tamanho de font
        txt1.setIconTextGap(25);       //Espaço entre texto e imagem
        txt1.setBackground(Color.black);//background color tbm setOpaque true
        txt1.setOpaque(true);           //background color

        //ALINHAR LABEL
        txt1.setVerticalAlignment(JLabel.CENTER);       //vai ficar sempre no centro, mesmo  com resize
        txt1.setHorizontalAlignment(JLabel.CENTER);

        //JFRAME POSICIONAMENTO
        //janela1.setLayout(null);


        //JLABEL POSICIONAMENTO
        //txt1.setBounds(50,50,450,450);


        janela1.pack(); // PACK() vai ajustar tamanho da janela e das labels auto, ajusta sozinho o tamanho da janela
                        //  conforme o tamanho da font das imagens, deve ser usado no fim de adicionar todas as labels e janelas
        janela1.setVisible(true);            //SET VISIBLE TRUE

    }
}
