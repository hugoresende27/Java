package BroTutorials;
/*
The JOptionPane is a subclass of JComponent class which includes static methods for creating and customizing modal
dialog boxes using a simple code. ... The JOptionPane displays the dialog boxes with one of the four standard icons
(question, information, warning, and error) or the custom icons specified by the user.
 */

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //IMAGEICON
        ImageIcon icone = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra");

        //JOPTIONPANE

        //plain
        //JOptionPane.showMessageDialog(null,"Teste1","TITULO TESTE",JOptionPane.PLAIN_MESSAGE);
        //info
        //JOptionPane.showMessageDialog(null,"Teste1","TITULO TESTE",JOptionPane.INFORMATION_MESSAGE);
        //question
        //JOptionPane.showMessageDialog(null,"Teste1","TITULO TESTE",JOptionPane.QUESTION_MESSAGE);
        //warning
        //while(true){
            //JOptionPane.showMessageDialog(null,"Teste1","TITULO TESTE",JOptionPane.WARNING_MESSAGE);
        //}

        //error
        //JOptionPane.showMessageDialog(null,"Teste1","TITULO TESTE",JOptionPane.ERROR_MESSAGE);

        //YES NO CANCEL
        int res = JOptionPane.showConfirmDialog(null,"BRO do u CODE?", "BROS tuts", JOptionPane.YES_NO_CANCEL_OPTION
        );
        System.out.println(res);
        String name = JOptionPane.showInputDialog("What is your name?  ");
        System.out.println("HELLO " +name );

        //SHOWOPTION DIALOG tudo num só
        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                0);

    }
}
