package broTutorials;
/*
1.Declare you object (don't instanciate)
2.class implement Serializable
3.FileInputStrem fileIn = new FileInputStream (file path);
4.ObjectInputStream in = new ObjectInputStream(fileIn);
5.objectNam = (Class) in.readObject();
in.close();fileIn.close();
 */

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //declarar user como null
        User user = null;

        FileInputStream fileIn = new FileInputStream("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\Fundamentos de JAVA_789\\serialization\\userInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        //vai aceder ao ficheiro criado em serialization, que tem os valores da variáveis
        System.out.println(user.name);
        System.out.println(user.pass);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("SERIAL VERSION UID:::"+ serialVersionUID);
    }
}
