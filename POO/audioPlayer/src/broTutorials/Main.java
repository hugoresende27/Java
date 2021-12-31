package broTutorials;
/*
Para tocar o clip preciso de um while senão o clip toca e pára 

 */

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {

        Scanner scanner = new Scanner(System.in);

        /////CRIAR OBJETO FILE COM O FICHEIRO WAV
        File file = new File("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\POO\\ficheiros_teste\\som1.wav");
        //GETAUDIOINPUTSTREAM
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        //CRIAR OBJETO CLIP
        Clip clip = AudioSystem.getClip();
        clip.open(audio);


        String rsp = "";

        while (!rsp.equals("Q")){
            System.out.println("P -- PLAY\nS --STOP\nR -- RESET\nQ -- QUIT");
            System.out.print("Insira a sua escolha-->");
            rsp = scanner.next();
            rsp = rsp.toUpperCase();

            switch (rsp){
                case ("P"):     //PLAY
                    clip.start();
                    break;
                case ("S"):     //STOP
                    clip.stop();
                    break;
                case ("R"):     //RESET
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):     //QUIT
                    clip.close();
                    break;
                default:
                    System.out.println("INVALIDO");

            }
        }


    }
}
