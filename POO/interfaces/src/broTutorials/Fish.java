package broTutorials;

public class Fish  implements  Prey,Predator{//a class Fish implementa Prey e Predator
    @Override
    public void hunt() {
        System.out.println("This fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from a shark");
    }
}
