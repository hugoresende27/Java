package broTutorials;
/*
The File class from the java.io package, allows us to work with files.
To use the File class, create an object of the class, and specify the filename or directory name:
 */

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //File file = new File("secret_msg.txt");
        File file2 = new File("E:/Other projects/GitHub/MeusProjetos/JAVA/Java/POO/ficheiros_teste/msg1.txt");

        if (file2.exists()){                                //EXISTS()
            System.out.println("Ficheiro Existe!");
            System.out.println("PATH::"+file2.getPath());//secret_msg.txt   //PATH()
            System.out.println("ABSOLUTE PATH::"+file2.getAbsolutePath());
            //E:\Other projects\GitHub\MeusProjetos\JAVA\Java\POO\classFile\secret_msg.txt
            System.out.println(file2.isFile()); //true      //ISFILE()
            file2.delete();//elimina o ficheiro             //DELETE()

        } else {
            System.out.println("Ficheiro não encontrado!");
        }
        ///////////////////  FILEWRITER (try catch)  ///////////////////////////////////////////////////
        try {
            FileWriter writer = new FileWriter("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\POO\\ficheiros_teste\\poema.txt");
            writer.write("Roses are red!\nViolets are blue\nBooty booty booty\nRocking everywhere"); //WRITER
            writer.append("\nUm poema de Bro");             //APPEND
            writer.close();                                 //CLOSE
        } catch (IOException e) {
            e.printStackTrace();
        }

        ///////////////////  FILEREADER (try catch)  ///////////////////////////////////////////////////
        //filereader return de um int , quando retornar -1 acabou o ficheiro
        // FileReader = read the contents of a file as a stream of characters. One by one
        //				read() returns an int value which contains the byte value
        //				when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\POO\\ficheiros_teste\\art.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

