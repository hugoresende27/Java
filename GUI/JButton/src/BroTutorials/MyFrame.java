package BroTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton btn,btn2;//btn instanciado aqui para ser usado no metodo @override
    JLabel label1;

    MyFrame(){      //CONSTRUTOR DA FRAME

        ////IMAGEICON
        ImageIcon icone = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\fixe.png");
        ImageIcon icone2 = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\hr_logo.png");

        //LABEL
        label1 = new JLabel();
        label1.setIcon(icone2);
        label1.setBounds(0,0,50,50);
        label1.setVisible(false);



        //BUTTON
        btn = new JButton();
        btn.setBounds(50,100,250,200);//posição e tamanho do btn
        btn.addActionListener(this);    //para funcionar, metodo addActionListener(this)
        btn.addActionListener(e-> System.out.println("TESTE2"));    //outro metodo  lambda ->
        btn.setText("SOU um Botão!");       //texto do botão
        btn.setFocusable(false);
        btn.setIcon(icone); //IMAGEICON ADICIONADO AQUI AO BOTÃO
        btn.setHorizontalTextPosition(JButton.CENTER);//COLOCAR TEXTO DO BOTÃO AO CENTRO
        btn.setVerticalTextPosition(JButton.BOTTOM);//COLOCAR TEXTO DO BOTÃO NO BOTTOM
        btn.setFont(new Font("Comic Sans", Font.BOLD, 20));
        btn.setIconTextGap(-15);        //para aproximar o texto
        btn.setForeground(Color.red);       //Cor do texto
        btn.setBackground(Color.green);     //Cor de fundo do botão
        btn.setBorder(BorderFactory.createEtchedBorder());//borda do botão
        //btn.setEnabled(false);    //botão disable

        //BUTTON2
        btn2 = new JButton();
        btn2.setBounds(50,300,250,200);//posição e tamanho do btn
        btn2.addActionListener(this);
        btn2.addActionListener(e-> System.out.println("TESTE3"));
        btn2.setText("SOU um Botão!");       //texto do botão
        btn2.setFont(new Font("Comic Sans", Font.BOLD, 20));
        btn2.setForeground(Color.blue);       //Cor do texto
        btn2.setBackground(Color.red);     //Cor de fundo do botão
        btn2.setEnabled(false);



        //FRAME this.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,700);
        this.setVisible(true);

        this.add(btn);
        this.add(btn2);
        this.add(label1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            System.out.println("TESTE");        //ao acionar btn, imprime na consola TESTE
            btn.setEnabled(false);      //depois de clicado uma vez, botão fica disable
            btn2.setEnabled(true);
            label1.setVisible(true);
        }
    }
}
