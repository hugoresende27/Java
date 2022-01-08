package broTutorials;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1;

    String name;
    transient String pass;

    public void sayHello(){
        System.out.println("Hello "+name);
    }
}
