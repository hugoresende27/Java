package guiTutorials;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Como te chamas?");

        int idade = Integer.parseInt( //converter para Int porque JOptionPane devolve string
                JOptionPane.showInputDialog("Idade?"));

        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Quanto medes ? "));

        /////////////////////////////////////////////////////////////////////////////////////
        JOptionPane.showMessageDialog(null,"Olá "+ name +
                                                               "\nTens "+ idade +  " anos de idade" +
                                                               "\nTens "+ altura + " cm's de altura");
        //JOptionPane.showMessageDialog(null,"Tens "+ idade + " anos de idade");
        //JOptionPane.showMessageDialog(null,"Tens "+ altura + " cm's de altura");
    }
}
