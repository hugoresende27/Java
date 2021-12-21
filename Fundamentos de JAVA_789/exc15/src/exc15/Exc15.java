/*
Exercicio15_A
Faça um programa que:
Leia um número e exiba o mês correspondente. (1 –janeiro, 2-fevereiro, etc).
Se digitar outro valor deve aparecer valor inválido.
Exercicio15_B
Desenvolva um programa que:
Verifique se a letra digitada é vogal ou consoante
IF … Else
Exercicio15_C
Desenvolva um programa que:
Determine qual é a idade que o utilizador tem no ano atual.
Para isso solicite o ano de nascimento do utilizador e o ano atual.
Exercicio15_D
Desenvolva um programa que:
Verifique se o utilizador é maior de idade ou não.
Exercicio15_E
Desenvolva um programa que:
Receba do utilizador o nome de um mês. Exiba o trimestre equivalente. Use o ciclo IF.
Para evitar repetir maiúsculas e minúsculas, use o comando equalsIgnoreCase
 */
package exc15;


import static java.lang.Character.isLetter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Exc15 {
    
    public static void quinzeA(int num){
        switch (num){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
    
    public static void quinzeB(char l){
        if ((l == 'a') || (l == 'e') ||(l == 'i') ||(l == 'o') || (l == 'u')) {
            System.out.println("VOGAL");
        }else {
            System.out.println("CONSOANTE");
        }
    }
    
    public static int quinzeC(int anoA, int anoN){
        return anoA-anoN;
    }
    
    public static boolean quinzeD(int idade){
        if (idade>=18) return true;
        else return false;
    }
    
    public static void quinzeE(String n){
        if ((n.equalsIgnoreCase("janeiro")) || 
            (n.equalsIgnoreCase("fevereiro")) || 
            (n.equalsIgnoreCase("marco"))){
            System.out.println("INVERNO");
        } else if ((n.equalsIgnoreCase("abril")) || 
            (n.equalsIgnoreCase("maio")) || 
            (n.equalsIgnoreCase("junho"))){
            System.out.println("PRIMAVERA");
        } else if ((n.equalsIgnoreCase("julho")) || 
            (n.equalsIgnoreCase("agosto")) || 
            (n.equalsIgnoreCase("setembro"))){
            System.out.println("VERÃO");
        } else if ((n.equalsIgnoreCase("outubro")) || 
            (n.equalsIgnoreCase("novembro")) || 
            (n.equalsIgnoreCase("dezembro"))){
            System.out.println("OUTONO");}
    }

    public static void quinzeF(String n){
        switch (n.toLowerCase()){
                case "janeiro":
                case "fevereiro":
                case "marco":
                    System.out.println("INVERNO");
                    break;
                case "abril":
                case "maio":
                case "junho":
                    System.out.println("PRIMAVERA");
                    break;
                case "julho":
                case "agosto":
                case "setembro":
                    System.out.println("VERÂO");
                    break;
                case "outubro":
                case "novembro":
                case "dezembro":
                    System.out.println("OUTONO");
                    break;
                default :
                    System.out.println("Mês inválido!");
                    break;
            }
    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        
        Scanner input = new Scanner (System.in);
        System.out.println("******MENU******");
        System.out.println("* 1. 15A   *****");
        System.out.println("* 2. 15B   *****");
        System.out.println("* 3. 15C   *****");
        System.out.println("* 4. 15D   *****");
        System.out.println("* 5. 15E   *****");
        System.out.println("* 6. 15F   *****");
        System.out.println("****************");
        System.out.print("Escolha--> ");
        int op = input.nextInt();
        
        switch (op){
            case 1:
                System.out.println("Qual o mês? ");
                int mes= input.nextInt();
                quinzeA(mes);
                break;
            case 2:
                System.out.println("Qual a letra?");
                char letra = Character.toLowerCase((input.next().charAt(0)));
                if (isLetter(letra)){
                    quinzeB(letra);
                }else {
                    System.out.println("LETRAS APENAS");
                }
                
                break;
            case 3:
                System.out.println("O ANO ATUAL:: "+anoAtual);
                System.out.println("Qual o ano atual?");
                int aa = input.nextInt();
                System.out.println("Qual o ano de nascimento?");
                int an = input.nextInt();
                System.out.printf("\n\tTens %d anos de idade\n", quinzeC(aa,an));
                break;
            case 4:
                System.out.print("Qual a idade? ");
                int idade = input.nextInt();
                if (quinzeD(idade)) System.out.println("MAIOR!");
                else System.out.println("menor");
                break;
            case 5:
                String mesB = "";
                System.out.print("Qual o mês? --> ");
                mesB = input.next();//.toLowerCase();
                quinzeE(mesB);
                break;             
            case 6:
                String mesC ="";
                System.out.println("Qual o mês? --> ");               
                mesC = input.next();//.toLowerCase();
                quinzeF(mesC);
                break;
            default:
                System.out.println("Opcao inválida");
                break;
        }
    }
    
}
