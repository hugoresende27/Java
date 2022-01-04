package BroTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());


        String[] animais = {"Coelho", "Cão", "Gato", "Pássaro"};

        comboBox = new JComboBox(animais);
        comboBox.addActionListener(this);       //actionlistener para combobox
        comboBox.setEditable(true);         //editar texto
        System.out.println(comboBox.getItemCount());            //contagem de elementos
        comboBox.addItem("Cavalo");
        comboBox.insertItemAt("Foca",1);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == comboBox){

                System.out.println(comboBox.getSelectedItem());
                System.out.println(comboBox.getSelectedIndex());
            }
    }
}
