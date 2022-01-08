package broTutorials;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/*
TimerTask is an abstract class defined in java. util package. TimerTask class defines a task that can be scheduled to
run for just once or for repeated number of time. ... Note: An instance of TimerTask class is used to define a task the
needs to run periodically.
 */
public class Main {

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarefa completa!");
            }
        };

        Calendar data = Calendar.getInstance();
        data.set(Calendar.YEAR,2022);
        

        //tarefa é executa 3 segundos depois
        //timer.schedule(task,3000);
    }
}
