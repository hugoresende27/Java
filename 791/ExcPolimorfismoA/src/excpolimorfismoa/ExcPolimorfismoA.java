/*
Fazer um programa que mostre os dados de vários produtos (número de produtos a 
apresentar deverá ser inserido pelo utilizador).
Todos os produtos têm um nome, uma descrição, um preço e uma categoria (exemplo: 
frescos, congelados, etc).
Podemos ter produtos nacionais e produtos importados. Os produtos importados deverão ter 
uma taxa de importação de 5% que se deverá refletir no preço final do produto. Os produtos 
nacionais deverão indicar o tipo (biológico ou não biológico)
Deverão ser apresentados todos os dados de cada produto na etiqueta do produto.

 */
package excpolimorfismoa;

import entidades.Produtos;
import entidades.Produtos_importados;
import entidades.Produtos_nacionais;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class ExcPolimorfismoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        
        
        List<Produtos> prods = new ArrayList<>();
        
        System.out.println("Quantos produtos?");
        int qts = input.nextInt();
        for (int i=0; i<qts; i++){
            System.out.println("Nome do Produto?");
            input.nextLine();
            String nome = input.nextLine();
            System.out.println("Descrição do Produto?");
            String des = input.nextLine();
            System.out.println("Preço?");
            int preco = input.nextInt();
            System.out.println("Categoria?");
            input.nextLine();
            String cat = input.nextLine();
            System.out.println("Produto Importado(s/n)?");
            char op = Character.toLowerCase((input.next().charAt(0)));
            if (op == 's'){
                
                Produtos p = new Produtos_importados(nome, des, cat, preco, 0.05);
                p.setPreco(preco);
                prods.add(p);
            }
            else {
                System.out.println("Produto Biológico?");
                char op2 = Character.toLowerCase((input.next().charAt(0)));
                if (op2 == 's'){
                    Produtos p = new Produtos_nacionais(nome, des, cat, preco, "SIM");
                    prods.add(p);
                } else {
                    Produtos p = new Produtos_nacionais(nome, des, cat, preco, "NÃO");
                    prods.add(p);
                }
            }
           
        }
        
        for (Produtos p : prods ){
            System.out.println(p);
        }
    }
    
}
