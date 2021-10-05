
package livro_1;
import java.util.*;

class meuObjeto         //criar um objeto simples, com dados
{
    String nome;
    int idade;
    String telefone; 
    
    public void aniversario()  //criar um metodo chamado aniversario q 
    {                           //vai adicionar +1 a idade
        idade=idade+1;          //tipo void não retorna nada
    }
    
    int idadeEmMeses()      //criar metodo com retorno int
    {
        return (idade*12);
    }
    
    void alterarIdade(int nova_idade)   //para alterar ao atributo idade do objeto
    {                                   //criar um metodo em q envio argumento/parametro
        idade=idade+nova_idade;
    }
}

public class Livro_1 {

  
    public static void main(String[] args) {
        meuObjeto amigo = new meuObjeto();  //instanciar o objeto
        amigo.nome="Hugo";                  //guardar dados no objeto
        amigo.idade=32;
        amigo.telefone="233919149";
        System.out.println("NOME::"+ amigo.nome+"\nIDADE::"+amigo.idade+"\nTELF::"+amigo.telefone);
        System.out.println("IDADE ANTIGA:: "+amigo.idade);
        amigo.aniversario();     //usar o metodo aniversario no objeto, neste caso amigo
        System.out.println("NOVA IDADE:: "+amigo.idade);
        System.out.println("IDADE EM MESES::"+amigo.idadeEmMeses());
        int idade_em_meses_var=amigo.idadeEmMeses(); //se quiser usar o valor guardo numa var do mesmo tipo
        System.out.println(idade_em_meses_var);
        amigo.alterarIdade(50);
        System.out.println("Idade depois de 50 em meses:: "+amigo.idadeEmMeses());
        System.out.println("Hoje é dia\n");
        System.out.println(new Date());     //print da data, com recurso ao import util.*
    }
    
}
