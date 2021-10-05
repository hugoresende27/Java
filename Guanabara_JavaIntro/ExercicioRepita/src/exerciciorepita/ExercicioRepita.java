/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Hugo
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null,"Olá Hugo!!!","Boas vinda",JOptionPane.WARNING_MESSAGE);
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número:: "));
        //JOptionPane.showMessageDialog(null,"Você digitou o valor "+n);
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 22));
        int n;
        int soma =0;
        int pares =0,impares=0,acima=0,total=0;
        float media=0;
        do
        {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe o número:<br><em>valor 0 interrompe</em></br></html>"));
            total+=1;
            soma+=n;
            if (n%2!=0) pares+=1;
            else impares+=1;
            if (n>=100) acima+=1;
        }while (n!=0);
        media = soma/total;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>"+
                                            "<br>Somatório vale :: "+ soma+
                                            "<br>Total de valores:: "+ total+
                                            "<br>Total Pares:: "+ pares+
                                            "<br>Total Impares:: "+ impares+
                                            "<br>Acima de 100:: "+ acima     +
                                            "<br>Media :: "+ media);
    }
    
}
