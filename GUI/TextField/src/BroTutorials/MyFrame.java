package BroTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//                  JFrame para a janela e ActionListener para os botões
public class MyFrame extends JFrame implements ActionListener {

    //botão
    JButton btn1 ;
    //textfield
    JTextField txt1 ;


    //construtor da Frame
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        //botão
        btn1 = new JButton("ENVIAR");
        btn1.addActionListener(this);       //this e depois completar metodo @Override

        //textfield
        txt1 = new JTextField();
        txt1.setPreferredSize(new Dimension(250,40));
        txt1.setFont(new Font("Consolas",Font.PLAIN,35));
        txt1.setForeground(new Color(0x00ff00));
        txt1.setBackground(Color.black);
        txt1.setCaretColor(Color.white);
        txt1.setText("USER:");
        //txt1.setEditable(false);


        this.add(btn1);
        this.add(txt1);




        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource()==btn1){
                System.out.println("BEM VINDO "+ txt1.getText());
                btn1.setEnabled(false);
                txt1.setEditable(false);
            }
    }
}
