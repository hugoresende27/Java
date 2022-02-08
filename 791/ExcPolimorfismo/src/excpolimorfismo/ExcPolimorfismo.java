/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excpolimorfismo;

import entidades.Funcionario;
import entidades.FuncionarioTemp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        List<Funcionario> funcs = new ArrayList<>();
        
        System.out.println("Quantos funcionários? ");
        int qts = input.nextInt();
        for (int i=0; i<qts; i++){
            System.out.println("Nome do Funcionário?");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Horas de "+nome+" ? ");
            
            int hrs = input.nextInt();
            System.out.println("Valor hora de "+nome+" ? ");
            double valorHr = input.nextDouble();
            System.out.println("Funcionário Temporário(s/n)?");
            char op = Character.toLowerCase((input.next().charAt(0)));
            if (op == 's'){
                System.out.println("Taxa Extra? ");
                double tx = input.nextDouble();
                Funcionario f = new FuncionarioTemp(nome, hrs, valorHr, tx);
                funcs.add(f);
            }
            else {
                Funcionario f = new Funcionario(nome, hrs, valorHr);
                 funcs.add(f);
            }
           
        }
        
        for (Funcionario f : funcs ){
            System.out.println(f);
        }
    }
    
}
