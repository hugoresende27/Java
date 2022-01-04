package BroTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;
    JComboBox comboBox2;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);

        String[] animais = {"Coelho", "Cão", "Gato", "Pássaro"};

        comboBox = new JComboBox(animais);
        comboBox.addActionListener(this);       //actionlistener para combobox
        //comboBox.setEditable(true);         //editar texto
        System.out.println(comboBox.getItemCount());            //contagem de elementos
        comboBox.addItem("Cavalo");
        comboBox.insertItemAt("Foca",1);        //adicionar ao index 1
        comboBox.insertItemAt("Peixe",0);       //adicionar ao index 0
        comboBox.setSelectedIndex(3);                       //index 3 previamente selecionado
        comboBox.removeItem("Cão");             //remover item pelo nome
        comboBox.removeItemAt(1);               //remover por indice
        //comboBox.removeAllItems();      //remover tudo

        //COMBOBOX COM ARRAY DE INT
        Integer [] alunos = {1,2,3,4,5};    //preciso de usar uma Wrapper class, Integer e não int

        comboBox2 = new JComboBox(alunos);

        //adicionar as comboBoxes à Frame
        this.add(comboBox);
        this.add(comboBox2);
        //this.pack(); //junta tudo no minimo size possivel
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
