package broTutorials;

public class Carro {

    ////////// ATRIBUTOS PRIVADOS ////////////
    private String marca;
    private String modelo;
    private int ano;

    Carro(String ma, String mo, int a){

        //this.modelo = mo;
        //this.marca = ma;
        //this.ano = a;
        //USO OS METODOS SET PARA CRIAR O OBJETO
        this.setModelo(mo);
        this.setMarca(ma);
        this.setAno(a);
    }

    public String toString(){
        return marca + "\t"+modelo+"\t"+ano;
    }
///////////   GETTERS   /////////////////////////////////////////////////
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
//////////////  SETTERS   ////////////////////////////////////////////////
    public void  setMarca(String ma){
        this.marca = ma;
    }
    public void setModelo(String mo){
        this.modelo = mo;
    }
    public void setAno(int a){
        this.ano = a;
    }
}
