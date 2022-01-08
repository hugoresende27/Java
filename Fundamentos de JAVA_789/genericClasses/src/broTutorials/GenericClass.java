package broTutorials;

//Thing extends Number , bounds apenas permite este tipo de subclasses
//https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html

    //public class GenericClass <Thing extends Number, Thing2 extends Number>{
    public class GenericClass <Thing , Thing2>{
    Thing x;
    Thing2 y;

    GenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue(){
        return y;
    }
}
