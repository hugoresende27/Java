package broTutorials;

import java.util.jar.JarEntry;

/*
Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies:
interface nada mais que uma espécie de contrato de regras que uma classes deve seguir em um determinado contexto.
Como em Java não existe herança múltipla, a interface passa a ser uma alternativa.
INTERFACE = um template que pode ser aplicado nas class, similar to herança. Um class pode ter várias interfaces
Metodos em override e implements nas classes
 */
public class Main {

    public static void main(String[] args) {

        //RABBIT implements Prey
        Rabbit rab = new Rabbit();

        rab.flee();

        //HAWK implements Predator
        Hawk hawk = new Hawk();

        hawk.hunt();
        //hawk.flee(); //metodo flee não está definido em Hawk



        //FISH  implements  Prey,Predator
        Fish peixe = new Fish();

        peixe.hunt();
        peixe.flee();
    }
}
