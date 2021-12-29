package broTutorials;
/*
posso passar objetos como parametros
 */

public class Main {

    public static void main(String[] args) {
	    Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car);   //chamar o objeto garage com o metodo park que recebe (car) como parametro
        garage.park(car2);
    }
}
