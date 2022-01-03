package BroTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    ImageIcon pizzaIco = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\pizza.jpg");
    ImageIcon hamIco = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\hamb.jpg");
    ImageIcon hotdogIco = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\hotdog.png");

    JRadioButton pizzaBtn;
    JRadioButton hambBtn;
    JRadioButton hotdogBtn;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaBtn = new JRadioButton("pizza");
        hambBtn = new JRadioButton("Hamburguer");
        hotdogBtn = new JRadioButton("Hot Dog");

        ButtonGroup grupoBtn = new ButtonGroup();
        grupoBtn.add(pizzaBtn);
        grupoBtn.add(hambBtn);
        grupoBtn.add(hotdogBtn);

        this.add(pizzaBtn);
        this.add(hambBtn);
        this.add(hotdogBtn);


        pizzaBtn.addActionListener(this);
        hambBtn.addActionListener(this);
        hotdogBtn.addActionListener(this);

        pizzaBtn.setIcon(pizzaIco);
        hambBtn.setIcon(hamIco);
        hotdogBtn.setIcon(hotdogIco);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==pizzaBtn){
                System.out.println("Pediu Pizza!");
            } else if (e.getSource()==hambBtn){
                System.out.println("Pediu um Hamburguer!");
            } else if (e.getSource()==hotdogBtn){
                System.out.println("Pediu um Hot Dog!");
            }
    }
}
