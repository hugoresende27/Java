package broTutorials;
/*
1.Declare you object (don't instanciate)
2.class implement Serializable
3.FileInputStrem fileIn = new FileInputStream (file path);
4.ObjectInputStream in = new ObjectInputStream(fileIn);
5.objectNam = (Class) in.readObject();
in.close();fileIn.close();
 */

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {

        //declarar user como null
        User user = null;

        FileInputStream fileIn = new FileInputStream("teste.ser");
    }
}
