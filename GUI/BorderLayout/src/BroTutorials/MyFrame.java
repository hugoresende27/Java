package BroTutorials;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

        MyFrame(){

            ////////panels
            JPanel painelVer = new JPanel();
            painelVer.setBackground(Color.red);
            //painelVer.setBounds(0,0,800,100);
            painelVer.setPreferredSize(new Dimension(100,100));

            JPanel painelVerde = new JPanel();
            painelVerde.setBackground(Color.green);
            //painelVerde.setBounds(0,0,100,600);
            painelVerde.setPreferredSize(new Dimension(100,100));

            JPanel painelAma = new JPanel();
            painelAma.setBackground(Color.yellow);
            //painelAma.setBounds(700,0,100,600);
            painelAma.setPreferredSize(new Dimension(100,100));

            JPanel painelRoxo = new JPanel();
            painelRoxo.setBackground(Color.magenta);
            //painelRoxo.setBounds(0,500,800,100);
            painelRoxo.setPreferredSize(new Dimension(100,100));

            JPanel painelAzul = new JPanel();
            painelAzul.setBackground(Color.blue);
            //painelAzul.setBounds(100,100,600,400);
            painelAzul.setPreferredSize(new Dimension(100,100));

            //SUB PANELS ---------------------------------------
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();
            JPanel panel5 = new JPanel();

            panel1.setBackground(Color.black);
            panel2.setBackground(Color.darkGray);
            panel3.setBackground(Color.gray);
            panel4.setBackground(Color.orange);
            panel5.setBackground(Color.lightGray);

            painelAzul.setLayout(new BorderLayout());       //set layout new BorderLayout no painelAzul

            panel1.setPreferredSize(new Dimension(50,50));
            panel2.setPreferredSize(new Dimension(50,50));
            panel3.setPreferredSize(new Dimension(50,50));
            panel4.setPreferredSize(new Dimension(50,50));
            panel5.setPreferredSize(new Dimension(50,50));

            painelAzul.add(panel1,BorderLayout.NORTH); //adicionar o panel1 dentro do painelVer no topo(north)
            painelAzul.add(panel2,BorderLayout.WEST);
            painelAzul.add(panel3,BorderLayout.EAST);
            painelAzul.add(panel4,BorderLayout.SOUTH);
            painelAzul.add(panel5,BorderLayout.CENTER);


            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(810,610);
            this.setVisible(true);
            this.setLayout(new BorderLayout(10,10));     //set new border layout


            this.add(painelVer,BorderLayout.NORTH);     //north para o topo
            this.add(painelVerde,BorderLayout.WEST);    //west lado esquerdo
            this.add(painelAma, BorderLayout.EAST);     //east lado direito
            this.add(painelRoxo, BorderLayout.SOUTH);   //south lado sul
            this.add(painelAzul, BorderLayout.CENTER);
        }
}
