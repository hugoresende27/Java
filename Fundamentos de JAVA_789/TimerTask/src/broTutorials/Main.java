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

        //obter ano actual pelo sistema
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(anoAtual);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            //contador
            int cont = 10;

            @Override
            public void run() {
                if (cont>0){
                    System.out.println(cont+" segundos");
                    cont--;
                } else {
                    System.out.println("Tarefa completa!\nFELIZ ANO NOVO!");
                    timer.cancel();
                }

            }
        };

        //declarar data da class Calendar e definir data
        Calendar data = Calendar.getInstance();
        data.set(Calendar.YEAR,2022);
        data.set(Calendar.MONTH,Calendar.DECEMBER);
        data.set(Calendar.DAY_OF_MONTH,31);
        data.set(Calendar.HOUR_OF_DAY,23);
        data.set(Calendar.MINUTE,59);
        data.set(Calendar.SECOND,50);
        data.set(Calendar.MILLISECOND,0);
        //usar timer.schedule (tarefa, data.getTime);
        //timer.schedule(task, data.getTime());

        //repetir a tarefa com AtFixedRate
        timer.scheduleAtFixedRate(task,0,1000);

        //executar a tarefa a uma data definida e repetir sempre nessa data
        timer.scheduleAtFixedRate(task,data.getTime(),1000);

        //tarefa é executa 3 segundos depois
        //timer.schedule(task,3000);
    }
}
