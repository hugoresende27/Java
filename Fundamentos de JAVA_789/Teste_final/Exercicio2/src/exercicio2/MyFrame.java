package exercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton btn;
    JLabel lbl;
    JTextField nota1;
    JTextField nota2;


    MyFrame () {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBounds(250,250,400,300);

        btn = new JButton("Calcular media");

        btn.addActionListener(this);    //activar o botão

        nota1 = new JTextField();
        nota1.setColumns(5);
        nota1.setText("nota 1");

        nota2 = new JTextField();
        nota2.setColumns(5);
        nota2.setText("nota 2");

        lbl = new JLabel();
        lbl.setBounds(50,150,200,200);
        lbl.setText("Resultado");



        this.add(btn);
        this.add(nota1);
        this.add(nota2);
        this.add(lbl);

        this.setLocationRelativeTo(null);//centrar a janela

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn){
            int n1 = Integer.parseInt( nota1.getText());
            int n2 = Integer.parseInt( nota2.getText());
            String classi = "";

            float media = (n1+n2)/2;
            if (media >=9){//se a media for maior do que 9, aprovado
                classi = "APROVADO";
            } else if (media>=7){//se for abaixo de 9 e maior do que 7, recuperação
                classi = "RECUPERAÇÂO";
            } else {//se for abaixo de 7, reprovado, aqui basta um else não preciso de testar a condição
                classi = "REPROVADO";
            }
            lbl.setText("MEDIA "+media + "SITUAÇÃO:: "+classi);

        }
    }


}
