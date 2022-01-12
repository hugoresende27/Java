package broTutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField txtField;
    JButton[] numbBtns = new JButton[10];//numeros
    JButton[] funcBtns = new JButton[8];//operações
    JButton addBtn, subBtn, multBtn, divBtn;
    JButton decBtn, equBtn, delBtn, clrBtn;
    JPanel panel;

    Font myFont = new Font("Consolas", Font.BOLD, 32);

    double numA = 0, numB = 0, res = 0;
    char op;


    /////////// CONSTRUCTOR /////////////////////////
    Calculator() {

        frame = new JFrame("Calculadora HR@2022");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        txtField = new JTextField();
        txtField.setBounds(50,25,300,50);
        txtField.setFont(myFont);
        txtField.setEditable(false);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        multBtn = new JButton("X");
        divBtn = new JButton("/");
        decBtn = new JButton(".");
        equBtn = new JButton("=");
        delBtn = new JButton("Delete");
        clrBtn = new JButton("Clear");


        funcBtns[0] = addBtn;
        funcBtns[1] = subBtn;
        funcBtns[2] = multBtn;
        funcBtns[3] = divBtn;
        funcBtns[4] = decBtn;
        funcBtns[5] = equBtn;
        funcBtns[6] = delBtn;
        funcBtns[7] = clrBtn;

        ////// LOOP BOTÕES OPERAÇÕES ///////////////////////
        for (int i=0; i<8;i++){
            funcBtns[i].addActionListener(this);
            funcBtns[i].setFont(myFont);
            funcBtns[i].setFocusable(false);//outline do botão
        }

        ////// LOOP BOTÕES NUMEROS ///////////////////////
        for (int i=0; i<10;i++){
            numbBtns[i] = new JButton(String.valueOf(i));
            numbBtns[i].addActionListener(this);
            numbBtns[i].setFont(myFont);
            numbBtns[i].setFocusable(false);
        }

        delBtn.setBounds(50,430,145,50);
        delBtn.setHorizontalTextPosition();
        clrBtn.setBounds(205,430,145,50);

        frame.add(delBtn);
        frame.add(clrBtn);
        frame.add(txtField);

        frame.setVisible(true);
    }

    //////////// OVERRIDES DOS ACTIONLISTENER /////////////////////
    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }
}



