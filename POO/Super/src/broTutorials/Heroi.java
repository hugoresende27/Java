package broTutorials;

public class Heroi extends  Pessoa{

    String poder;

    Heroi(String nome, int idade, String poder){
        super(nome,idade);//super para se referir à classe PAI, superClasse Pessoa

        this.poder = poder;
    }

    /////PUBLIC toString()
    public String toString(){
        return super.toString()+"PODER::"+this.poder;
    }
}
