package toString;

public class Carro {

    String marca = "Ford";
    String modelo = "Mustang";
    String cor ="vermelho";
    int ano = 2021;

    public String toString(){ //posso overload metodo toString
        /*
        String myString = marca + "\t"+modelo+"\t"+cor+"\t"+ano;
        return myString;
         */
        return marca + "\t"+modelo+"\t"+cor+"\t"+ano;
    }
}
