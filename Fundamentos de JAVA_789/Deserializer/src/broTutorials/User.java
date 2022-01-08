package broTutorials;

import java.io.Serializable;

public class User implements Serializable {

    String name;
    //transient vai da null no acesso À password
    transient String pass;

    public void sayHello(){
        System.out.println("Hello "+name);
    }
}
