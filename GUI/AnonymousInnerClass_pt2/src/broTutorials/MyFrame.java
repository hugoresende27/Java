package broTutorials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    //botões
    JButton btnA = new JButton("NR-1");
    JButton btnB = new JButton("NR-2");
    JButton btnC = new JButton("NR-3");

    MyFrame(){

        //set bounds e adicionar botões à frame
        btnA.setBounds(100,100,100,100);
        btnB.setBounds(200,100,100,100);
        btnC.setBounds(300,100,100,100);
        
        //adicionar new action listener
        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("botão nr 1");
            }
        });

        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("botão nr 2");
            }
        });

        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("botão nr 3");
            }
        });

        this.add(btnA);
        this.add(btnB);
        this.add(btnC);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setLayout(null);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
