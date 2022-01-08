package broTutorials;
/*
Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the
 same time. They are like local classes except that they do not have a name. Use them if you need to use a local class only once.
 classe sem nome usada uma vez, usado com action listeners
 */
public class Main {

    public static void main(String[] args) {

        //iniciar classe Greting
        Greting ola = new Greting();
        //usar metodo welcome
        //ola.Welcome();

        Greting anonCla = new Greting(){
            //metodo dentro da classe, tem o mesmo nome como override
            @Override
            public void Welcome(){
                System.out.println("HEY BROOOOS!!!");
            }
        };

        Greting maisUm = new Greting();

        anonCla.Welcome();
        maisUm.Welcome();
    }
}
