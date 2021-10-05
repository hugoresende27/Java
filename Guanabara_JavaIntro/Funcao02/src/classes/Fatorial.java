/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Hugo
 */
public class Fatorial {
    private int num =0;     //criar atributos privados, num começa em 0, fatorial em 1
    private int fat=1;          
    private String formula =""; //atributo string com a formula
    
    public void setValor(int n)     //metodo publico sem retorno
    {
        num = n;            //num é atributo, não variável simples, n var local
        int f=1;
        String s="";        
        for (int c=n; c>1;c--)      //contador começa em n, enquanto for maior que 1,
        {                           //antes de ser 0, c--, decrementa 1
            f *= c;                 //fatorial = fatorial * contador
            s += c + " X ";        //string fica numero do contador + " X " + string 
        }
        s+="1 = ";      //concatenar a formula que está no atributo s com "1 ="
        fat = f;        //atributo fat recebe f
        formula = s;    //atributo formula recebe s
    }
    
    public int getFatorial()        //metodo publico com retorno inteiro do fat
    {                               //apenas retorna o atributo fat
        return fat;
    }
    
    public String getFormula()      //metodo publico com retorno string da formula
    {                               //apenas retorna atributo formula
        return formula;         
    }
}
