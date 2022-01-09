package broTutorials;

public class MyThread extends Thread {

    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("Esta Deamon Thread está a correr !");
        } else {
            System.out.println("Esta é uma user Thread está a correr !");
        }

    }
}
