package broTutorials;
/*
Java provides a mechanism, called object serialization where an object can be represented as a sequence of bytes that
includes the object's data as well as information about the object's type and the types of data stored in the object. ...
This method retrieves the next Object out of the stream and deserializes it.
Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
This mechanism is used to persist the object. The byte stream created is platform independent.
So, the object serialized on one platform can be deserialized on a different platform.
1.class xxxx implements Serializable
2.FileOutputStream f = new FileOutputStrem (file path)
3.ObjectOutputStrem s = new ObjectOutputStream (f)
4.s.writeObject (objectname)
5.s.close();f.close();
 */

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        User u = new User();

        u.name = "Hugo";
        u.pass = "1234";

        u.sayHello();

        FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(u);
        out.close();
        fileOut.close();

        //cria ficheiro userInfo.ser (Java bytecode) na raiz do projeto
        System.out.println("Info do objeto guardado");

        long serialVersionUID = ObjectStreamClass.lookup(u.getClass()).getSerialVersionUID();
        System.out.println("SERIAL VERSION UID:::"+ serialVersionUID);
    }
}
