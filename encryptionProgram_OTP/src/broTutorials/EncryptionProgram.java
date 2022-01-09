package broTutorials;

import java.sql.Array;
import java.util.*;


public class EncryptionProgram {

    //DECLARAR GLOBAL VARS AND OBJECTS, SEM INICIALIZAR, SÓ DECLARAR
    private Scanner input;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char ch;
    private String line;
    private char[] letters;
    private char[] secretLetters;

    //1.///////////// CONSTRUTOR /////////////////////////
    EncryptionProgram(){

        //iniciar as vars/objetos
        input = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<>();
        shuffledList = new ArrayList<>();
        ch= ' ';

        newKey();
        menu();


    }

    //2.///////////// MENU /////////////////////////
    private void menu(){
        //loop while true(infinito)
        while(true){
            System.out.println("**** SELECT OPTION ****");
            System.out.println("**** (N) -> New key ***");
            System.out.println("**** (G) -> Get key ***");
            System.out.println("**** (E) -> Encrypt ***");
            System.out.println("**** (D) -> Decrypt ***");
            System.out.println("**** (Q) -> Quit    ***");
            System.out.print("**** Opção-->");
            //ler a primeira letra da resposta em MAIUSCULA
            char rsp = Character.toUpperCase(input.nextLine().charAt(0));

            switch (rsp){
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Invalid!!");
                    break;
            }

        }

    }

    //3.///////////// NEW KEY /////////////////////////
    private void newKey(){
        //reset char a espaço vazio
        ch = ' ';
        //limpar a lista e shufledList caso tenha dados
        list.clear();
        shuffledList.clear();

        //loop da tabela ASCII de espaço a Delete
        for (int i=32;i<127;i++){
            //adicionar caracteres à lista
            list.add(Character.valueOf(ch));
            ch++;
        }

        //instanciar shuffledList sendo uma cópia de list, porque list é passado como parametro
        shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("New key generated");

    }

    //4.///////////// GET KEY /////////////////////////
    private void getKey(){

        System.out.println("KEY LIST:: ");
        for (Character x : list){
            System.out.print(x+" ");
        }
        System.out.println("\nKEY SHUFFLED LIST:: ");
        for (Character x : shuffledList){
            System.out.print(x);
        }
        System.out.println();
    }

    //5.///////////// ENCRYPT /////////////////////////
    private void encrypt(){
        //perguntar mensagem a encriptar
        System.out.println("ENTER A MESSAGE TO ENCRYPT:::");
        String msg = input.nextLine();

        //preenche o array letras com a string mensagem
        letters = msg.toCharArray();
        //loop para percorrer array letters
        for (int i=0; i<letters.length; i++){
            //loop para percorrer a list com os chars todos
            for (int j=0; j<list.size();j++){
                //se letters na posição [i] == a elemento (j) de list
                if (letters[i]==list.get(j)){
                    //vai dar o valor no array letters correspondente na shuffledList
                    letters[i]=shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.print("Encrypted::");
        for(char x : letters){
            System.out.print(x);
        }
        System.out.println();
    }

    //6.///////////// DECRYPT /////////////////////////
    private void decrypt(){
        //Decrypt será o processo inverso de encrypt
        System.out.println("ENTER A MESSAGE TO DECRYPT:::");
        String msg = input.nextLine();

        letters = msg.toCharArray();

        for (int i=0; i<letters.length; i++){

            for (int j=0; j<shuffledList.size();j++){
                //se letters na posição [i] == a elemento (j) de shuffledlist
                if (letters[i]==shuffledList.get(j)){
                    //vai dar o valor no array letters correspondente da list
                    letters[i]=list.get(j);
                    break;
                }
            }
        }
        System.out.print("Decrypted::");
        for(char x : letters){
            System.out.print(x+" ");
        }
        System.out.println();

    }
    //7.///////////// QUIT ///////////////////////////
    private void quit(){
        System.out.println("Thank you, Hugo Resende Products @2022");
        System.exit(0);
    }
}
