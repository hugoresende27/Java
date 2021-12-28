
package jogodogalo;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Hugo
 */
public class JogoDoGalo {

    /**
     * JOGO DO GALO
     * - imprimir o quadro
     * - input de 1 user
     * - input random do pc
     * - verificar se o jogo acabou ou não
     * - tip: ALT + shift + M para criar private void methods
     */
    //////////////////////////////////////////////////////////////////
    public static void imprimeQuadro(char[][] quadro) {
        System.out.println(quadro[0][0] +"|"+quadro[0][1] +"|"+quadro[0][2]);
        System.out.println("-+-+-");
        System.out.println(quadro[1][0] +"|"+quadro[1][1] +"|"+quadro[1][2]);
        System.out.println("-+-+-");
        System.out.println(quadro[2][0] +"|"+quadro[2][1] +"|"+quadro[2][2]);
    }
    //////////////////////////////////////////////////////////////////
    private static void playerTurn( char[][] quadro, Scanner input) {
        String userInput;
        while (true){
            System.out.print("Onde quer jogar ? (0-9) -->");
            userInput = input.nextLine();
            if (validaJogada(quadro, userInput)){
                break;
            } else {
                System.out.println("Jogada Inválida -- "+ userInput);
            }
        }
        placeMove(quadro, userInput, 'X');
    }
    //////////////////////////////////////////////////////////////////
    private static void placeMove( char[][] quadro,String posicao,char symbol) {
        switch (posicao){
            case "1":
                quadro[0][0] = symbol;
                break;
            case "2":
                quadro[0][1] = symbol;
                break;
            case "3":
                quadro[0][2] = symbol;
                break;
            case "4":
                quadro[1][0] = symbol;
                break;   
            case "5":
                quadro[1][1] = symbol;
                break;
            case "6":
                quadro[1][2] = symbol;
                break;
            case "7":
                quadro[2][0] = symbol;
                break;
            case "8":
                quadro[2][1] = symbol;
                break;         
            case "9":
                quadro[2][2] = symbol;
                break;  
            default:
                System.out.println("INVÁLIDO!");
        }
    }
    //////////////////////////////////////////////////////////////////
    private static boolean validaJogada(char [][] quadro, String posicao){
        switch (posicao){
            case "1":
                return (quadro[0][0] == ' ');
                /*    return true; //se for == espaço vazio return true
                }else {
                    return false; , //senão return false
                }*/
            case "2":
                return (quadro[0][1] == ' ');
            case "3":
                return (quadro[0][2] == ' ');
            case "4":
                return (quadro[1][0] == ' ');   
            case "5":
                return (quadro[1][1] == ' ');
            case "6":
                return (quadro[1][2] == ' ');
            case "7":
                return (quadro[2][0] == ' ');
            case "8":
                return (quadro[2][1] == ' ');         
            case "9":
                return (quadro[2][2] == ' '); 
            default:
                return false;
        }
    }

    private static void computerTurn(char[][] quadro) {
        Random pcAI = new Random();
        int computerPlay;
        while (true){
            computerPlay = pcAI.nextInt(9) + 1;
            if (validaJogada(quadro,Integer.toString(computerPlay))){
                break;
            }
        } 
        System.out.println("Escolha PC--> "+computerPlay);
        placeMove(quadro, Integer.toString(computerPlay), 'O');
    }
    //////////////////////////////////////////////////////////////////
    private static boolean isGameOver(char[][] quadro) {
        if (computadorVenceu(quadro, 'X')){
            imprimeQuadro(quadro);
            System.out.println("Jogador 1 Venceu");
            return true;
        }
        if (computadorVenceu(quadro, 'O')){
            imprimeQuadro(quadro);
            System.out.println("Computador 1 Venceu");
            return true;
        }
 
        for (int i=0 ; i<quadro.length ; i++){
            for (int j=0; j< quadro[i].length; j++){
               if( quadro[i][j] == ' ') {
                   return false;
               }
            }
        }
        imprimeQuadro(quadro);
        System.out.println("EMPATE");
        return true;
    }
    ////////////////////////////////////////////////////////////////////
    private static boolean computadorVenceu(char[][] quadro, char symb) {
        //8 possiveis maneiras de vencer, 3 linhas horiz, 3 verts e 2 diagonais
        if ((quadro[0][0] == symb && quadro[0][1] == symb && quadro[0][2] == symb)  ||
                (quadro[1][0] == symb && quadro[1][1] == symb && quadro[1][2] == symb)  ||
                (quadro[2][0] == symb && quadro[2][1] == symb && quadro[2][2] == symb) ||
                
                (quadro[0][0] == symb && quadro[1][0] == symb && quadro[2][0] == symb)  ||
                (quadro[0][1] == symb && quadro[1][1] == symb && quadro[2][1] == symb)  ||
                (quadro[0][2] == symb && quadro[1][2] == symb && quadro[2][2] == symb) ||
                
                (quadro[0][0] == symb && quadro[1][1] == symb && quadro[2][2] == symb)  ||
                (quadro[0][2] == symb && quadro[1][1] == symb && quadro[2][0] == symb)) {
            return true; // jogo acabou return true
        }
        return false;
    }
    ////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // QUADRO (3 arrays de chars)
        char [][] quadro = {{' ', ' ', ' '},    //{'X', 'O', 'O'}
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}};
        
        char [][] quadro2 = {{'1', '2', '3'},    
                            {'4', '5', '6'},
                            {'7', '8', '9'}};
        ////////////////////////////////////////
        Scanner input = new Scanner (System.in);
        
        imprimeQuadro(quadro2);
        
        while (true){
            playerTurn(quadro, input);
            if (isGameOver(quadro)){
                break;
            }

            computerTurn(quadro);
            if (isGameOver(quadro)){
                break;
            }
            imprimeQuadro(quadro);
        }
         input.close();
    }
   

}
