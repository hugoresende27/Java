package broTutorials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton myBtn = new JButton("Botão A");
    JButton myBtn2 = new JButton("Botão B");
    JButton myBtn3 = new JButton("Botão C");

    MyFrame(){

        //action listener normal
        myBtn.setBounds(100,100,100,100);
        myBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Carregou no botão");
            }
        });

        //actionlistener com lambda
        myBtn2.setBounds(200,200,100,100);
        myBtn2.addActionListener(

            (e) -> System.out.println("Carregou NO OUTRO botão")
        );

        //uso de lambda
        myBtn3.setBounds(300,100,100,100);
        myBtn3.addActionListener(

                (e) -> System.out.println("terceiro botão")
        );

        //adicionar botões À frame
        this.add(myBtn);
        this.add(myBtn2);
        this.add(myBtn3);

        //config da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
