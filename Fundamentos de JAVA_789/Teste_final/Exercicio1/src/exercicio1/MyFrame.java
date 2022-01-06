package exercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JLabel lbl ;
    JButton btn;

    MyFrame (){

        //BUTTON
        btn = new JButton();
        btn.setBounds(275,105,50,50);//posição e tamanho do btn
        btn.addActionListener(this);    //para funcionar, metodo addActionListener(this)
        btn.setText("GO");       //texto do botão
        btn.setFocusable(false);

        btn.setHorizontalTextPosition(JButton.CENTER);//COLOCAR TEXTO DO BOTÃO AO CENTRO
        btn.setFont(new Font("Comic Sans", Font.BOLD, 15));
        btn.setForeground(Color.black);       //Cor do texto
        btn.setBackground(Color.green);     //Cor de fundo do botão
        btn.setBorder(BorderFactory.createEtchedBorder());//borda do botão


        //label
        lbl = new JLabel();
        lbl.setBounds(0,0,600,100);
        lbl.setForeground(Color.white);
        lbl.setFont(new Font("Consolas",Font.BOLD,16));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Numeros 0 a 100 5 a 5 - HR PRODUCTS @2022");

        this.setSize(600,200);
        this.setResizable(false);  //tamanho fixo
        this.setLayout(null);

        ImageIcon img = new ImageIcon("hr_logo.png");
        this.setIconImage(img.getImage());

        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.black);

        this.add(lbl);
        this.add(btn);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn){
                String tudo ="";
                for (Integer i=0; i<=100; i+=5){
                    System.out.print(i+ " ");
                    tudo += i.toString() + "|";
                }
                lbl.setText(tudo);
            }
    }
}
