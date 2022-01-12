package broTutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    /////////// MAIN /////////////////////////
    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }

    JMenuBar menuBar;   //barra
    JMenu ajudaMenu;    //separador
    JMenuItem sobreItem;//item


    /////////// VAR GLOBAIS /////////////////////////
    JFrame frame;
    JTextField txtField;
    JButton[] numbBtns = new JButton[10];//numeros
    JButton[] funcBtns = new JButton[9];//operações
    JButton addBtn, subBtn, multBtn, divBtn;
    JButton decBtn, equBtn, delBtn, clrBtn, negBtn;
    JPanel panel;

    Font myFont = new Font("Verdana", Font.BOLD, 28);

    double numA = 0, numB = 0, res = 0;
    char op;


    /////////// CONSTRUCTOR /////////////////////////
    Calculator() {

        //MENUBAR//========================
        menuBar = new JMenuBar();

        //ajudaMenu////////////////
        ajudaMenu = new JMenu("Ajuda");
        sobreItem = new JMenuItem("Sobre");
        sobreItem.addActionListener(this);

        ajudaMenu.add(sobreItem);

        //add ao menuBar/////////////////
        menuBar.add(ajudaMenu);

        frame.setJMenuBar(menuBar);//adicionar o menubar, setJMenuBar
        //============================================================

        frame = new JFrame("Calculadora HR@2022");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

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
        negBtn = new JButton("-/+");


        funcBtns[0] = addBtn;
        funcBtns[1] = subBtn;
        funcBtns[2] = multBtn;
        funcBtns[3] = divBtn;
        funcBtns[4] = decBtn;
        funcBtns[5] = equBtn;
        funcBtns[6] = delBtn;
        funcBtns[7] = clrBtn;
        funcBtns[8] = negBtn;

        ////// LOOP BOTÕES OPERAÇÕES ///////////////////////
        for (int i=0; i<9;i++){
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

        //////////BOTÃO DELETE ///////////////////
        delBtn.setBounds(150,430,100,50);
        delBtn.setVerticalTextPosition(JLabel.CENTER);
        delBtn.setHorizontalTextPosition(JLabel.CENTER);
        delBtn.setFont(new Font("consolas", Font.BOLD, 18));
        //////////BOTÃO CLEAR ///////////////////
        clrBtn.setBounds(250,430,100,50);
        clrBtn.setVerticalTextPosition(JLabel.CENTER);
        clrBtn.setHorizontalTextPosition(JLabel.CENTER);
        clrBtn.setFont(new Font("consolas", Font.BOLD, 18));
        //////////BOTÃO NEGATIVE ///////////////////
        negBtn.setBounds(50,430,100,50);
        negBtn.setVerticalTextPosition(JLabel.CENTER);
        negBtn.setHorizontalTextPosition(JLabel.CENTER);

        //////////////////  PANEL /////////////////
        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));


        panel.add(numbBtns[1]);
        panel.add(numbBtns[2]);
        panel.add(numbBtns[3]);
        panel.add(addBtn);
        panel.add(numbBtns[4]);
        panel.add(numbBtns[5]);
        panel.add(numbBtns[6]);
        panel.add(subBtn);
        panel.add(numbBtns[7]);
        panel.add(numbBtns[8]);
        panel.add(numbBtns[9]);
        panel.add(multBtn);
        panel.add(decBtn);
        panel.add(numbBtns[0]);
        panel.add(equBtn);
        panel.add(divBtn);


        ////////// ADD'S /////////////////
        frame.add(panel);
        frame.add(delBtn);
        frame.add(clrBtn);
        frame.add(negBtn);
        frame.add(txtField);

        frame.setVisible(true);
    }

    //////////// OVERRIDES DOS ACTIONLISTENER /////////////////////
    @Override
    public void actionPerformed(ActionEvent e) {
        //UPDATE TXTFIELD COM ELEMENTOS DO numbBtns
        for (int i=0; i<10 ; i++){
            if (e.getSource()==numbBtns[i]){
                txtField.setText(txtField.getText().concat(String.valueOf(i)));
            }
        }

        //BOTÃO DECIMAL
        if (e.getSource()==decBtn){

            String temp = txtField.getText();
            if (!temp.contains(".")){
                txtField.setText(txtField.getText().concat(String.valueOf(".")));
            }

        }

        //BOTÃO SOMAR
        if (e.getSource()==addBtn){
            numA = Double.parseDouble(txtField.getText());
            op = '+';
            txtField.setText("");
        }

        //BOTÃO SUBTRAIR
        if (e.getSource()==subBtn){
            numA = Double.parseDouble(txtField.getText());
            op = '-';
            txtField.setText("");
        }

        //BOTÃO MULTIPLICAR
        if (e.getSource()==multBtn){
            numA = Double.parseDouble(txtField.getText());
            op = '*';
            txtField.setText("");
        }

        //BOTÃO DIVIDIR
        if (e.getSource()==divBtn){
            numA = Double.parseDouble(txtField.getText());
            op = '/';
            txtField.setText("");
        }

        //BOTÃO IGUAL
        if (e.getSource()==equBtn){
            numB = Double.parseDouble(txtField.getText());
            switch (op){
                case '+':
                    res = numA + numB;
                    break;
                case '-':
                    res = numA - numB;
                    break;
                case '*':
                    res = numA * numB;
                    break;
                case '/':
                    res = numA / numB;
                    break;
            }
            txtField.setText(String.valueOf(res));
        }

        //BOTAO CLEAR
        if (e.getSource()==clrBtn){
            txtField.setText("");
        }

        //BOTAO DELETE
        if (e.getSource()==delBtn){
            String temp = txtField.getText();
            txtField.setText("");
            for (int i=0; i<temp.length()-1;i++){
                txtField.setText(txtField.getText()+temp.charAt(i));
            }
        }

        //BOTAO NEGATIVE
        if (e.getSource()==negBtn){
            double temp = Double.parseDouble(txtField.getText());
            temp *= -1;
            txtField.setText(String.valueOf(temp));
        }
    }



}



