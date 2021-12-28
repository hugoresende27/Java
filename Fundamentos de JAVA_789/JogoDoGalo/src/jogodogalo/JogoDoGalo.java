/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private static void playerTurn(String userInput, char[][] quadro) {
        switch (userInput){
            case "1":
                quadro[0][0] = 'X';
                break;
            case "2":
                quadro[0][1] = 'X';
                break;
            case "3":
                quadro[0][2] = 'X';
                break;
            case "4":
                quadro[1][0] = 'X';
                break;   
            case "5":
                quadro[1][1] = 'X';
                break;
            case "6":
                quadro[1][2] = 'X';
                break;
            case "7":
                quadro[2][0] = 'X';
                break;
            case "8":
                quadro[2][1] = 'X';
                break;         
            case "9":
                quadro[2][2] = 'X';
                break;  
            default:
                System.out.println("INVÁLIDO!");
        }
    }
    //////////////////////////////////////////////////////////////////
    private static boolean validaJogada(char [][] quadro, int posicao){
        switch (posicao){
            case 1:
                return (quadro[0][0] == ' ');
                /*    return true; se for == espaço vazio return true, senão return false
                }else {
                    return false;
                }*/
            case 2:
                return (quadro[0][1] == ' ');
            case 3:
                return (quadro[0][2] == ' ');
            case 4:
                return (quadro[1][0] == ' ');   
            case 5:
                return (quadro[1][1] == ' ');
            case 6:
                return (quadro[1][2] == ' ');
            case 7:
                return (quadro[2][0] == ' ');
            case 8:
                return (quadro[2][1] == ' ');         
            case 9:
                return (quadro[2][2] == ' '); 
            default:
                return true;
        }
    }
    //////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // QUADRO (3 arrays de chars)
        char [][] quadro = {{' ', ' ', ' '},    //{'X', 'O', 'O'}
                            {' ', '5', ' '},
                            {' ', ' ', ' '}};
        ////////////////////////////////////////
        imprimeQuadro(quadro);
        
        Scanner input = new Scanner (System.in);
        System.out.print("Onde quer jogar ? (0-9) -->");
        String userInput = input.nextLine();
    
        playerTurn(userInput, quadro);
        
        Random pcAI = new Random();
        while (true){
            int computerPlay = pcAI.nextInt(9) + 1;
            if (validaJogada(quadro,computerPlay)){
                break;
            }
        }
        
        imprimeQuadro(quadro);
    }

    
    
}
