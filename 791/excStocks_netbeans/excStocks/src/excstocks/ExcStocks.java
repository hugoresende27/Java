/*
Fazer um programa para ler os dados de um produto em stock (nome, preço e quantidade no stock). 
Em seguida:
	• Mostrar os dados do produto (nome, preço, quantidade no stock, valor total no stock)
	• Realizar uma entrada no stock e mostrar novamente os dados do produto
	• Realizar uma saída no stock e mostrar novamente os dados do produto

Classe Produto (nome,preco,quantidade)
Metodos (totalStock():double ; 
        adicionarProduto(qtd):void ; 
        removerProdutos(qtd):void
 */
package excstocks;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcStocks {
    
    public static void menu(){
        System.out.println("1.ADICIONAR PRODUTO");
        System.out.println("2.ADICIONAR STOCK");
        System.out.println("3.RETIRAR STOCK");
        System.out.println("4.SAIR");
    }
    
    public static Produto criarProduto(){
        Scanner input = new Scanner (System.in);
        
        //String nom=""; 
        //double pre=0;
        //int quat = 0;
        
        Produto p = new Produto();
        System.out.print("NOME:: ");
        p.nome = input.nextLine();
        System.out.print("PREÇO "+p.nome+" :: ");
        p.preco = input.nextDouble();
        System.out.print("QUANTIDADE "+p.nome+" :: ");
        p.qtd  = input.nextInt();
        
        //Produto p1 = new Produto(nom,pre,quat);
        return p;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int op;
        do{
            menu();
            System.out.print("Opcao-> ");
            op = input.nextInt();
            Produto p1 = new Produto();
            switch (op){
                case 1:
                    p1 = criarProduto();
                    System.out.println(p1);
                    break;
                case 2:
                    System.out.println("Quanto quer adicionar ao stock? ");
                    int adiciona = input.nextInt();
                    p1.adicionarProduto(adiciona);
                    System.out.println(p1);
                    break;
                case 3:
                     int retira;
                    do{
                        System.out.println("Quanto quer retirar ao stock? ");
                        retira = input.nextInt();    
                        if (retira > p1.qtd){
                            System.out.println("Nao pode retirar mais do que o stock existente\nSTOCK::"+p1.qtd);
                        }
                    }while (retira > p1.qtd);

                    p1.retirarProduto(retira);
                    System.out.println(p1);   
                    break;
                case 4:
                    System.out.println("Adeus...");
                    System.exit(0);
                    break;
                default :
                    System.out.println("opcao inválida\n");
                    break;
            }
        }while (true);
    }
 
}
