/*
///////////////////////////////////////////////////////////////////////////////
            ACCESS LEVELS
  MODIFIER | CLASS | PACKAGE | SUBCLASS | WORLD
  public   |  sim  |   sim   |   sim    |  sim
  protected|  sim  |   sim   |   sim    |  não
no_modifier|  sim  |   sim   |   não    |  não
  private  |  sim  |   não   |   não    |  não
///////////////////////////////////////////////////////////////////////////////
        PACKAGE = colecção de Classes
*/

package package1;
import package2.*;


public class A {

    /*
    ///////////  PROTECTED //////////////
    protected String protecMsg = "Esta mensagem é PROTECTED ....";

    */

    public static void main(String[] args) {
        C c = new C();
        //System.out.println(c.defaultMsg);//não consigo usar o aceder à var defaultMsg, está noutro pacote sem modifier
        System.out.println(c.publicMsg);    //publicMsg tem o modifier public, consigo aceder em qualquer package

        B b = new B();

        //System.out.println(b.privateMsg); //privateMsg só pode ser acedido dentro da class B

    }



}
