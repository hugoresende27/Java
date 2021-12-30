package overloadConstructors;
/*
Overloaded constructors = contrutores na mesma classe com o mesmo nome mas assinaturas diferentes
 */
public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("Alta","tomate","mozarella","pepperoni");
        Pizza pizza2 = new Pizza("Alta","tomate","mozarella");
        Pizza pizza3 = new Pizza("Alta","tomate");
        Pizza pizza4 = new Pizza("Alta");
        Pizza pizza5 = new Pizza();

        System.out.println("Ingredientes da Pizza");
        System.out.println(pizza.massa);
        System.out.println(pizza2.molho);
        System.out.println(pizza3.queijo);
        System.out.println(pizza4.topping);
        System.out.println(pizza5.massa);



    }
}
