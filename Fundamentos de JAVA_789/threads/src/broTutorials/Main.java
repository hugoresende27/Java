package broTutorials;
/*
Threads allows a program to operate more efficiently by doing multiple things at the same time.
Threads can be used to perform complicated tasks in the background without interrupting the main program.
Deamon threads low priority
thread como se fosse um mini cpu
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //count
        System.out.println("COUNT :: "+Thread.activeCount());
        //setname
        Thread.currentThread().setName("THREAD 1 teste");
        System.out.println(Thread.currentThread().getName());
        //priority
        //Thread.currentThread().setPriority(10);
        System.out.println("PRIORITY::: "+Thread.currentThread().getPriority());
        //isAlive
        System.out.println("ALIVE :: "+Thread.currentThread().isAlive());

        //contagem decrescente 3 2 1
        for (int i=3; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("CONCLUIDO");

        MyThread thread2 =  new MyThread();
        //deamon thread ou user thread criada pelo user
        thread2.setDaemon(false);
        System.out.println("IS DEAMON:: "+thread2.isDaemon());

        thread2.start();
        System.out.println("thread2 alive ::" +thread2.isAlive());
        thread2.setName("SEGUNDA thread");
        System.out.println("NAME::" +thread2.getName());
        //por defeito vai herdar a prioridade da thread onde é criada
        System.out.println("PRIORITY:: "+thread2.getPriority());
        Thread.currentThread().setPriority(2);
        System.out.println("PRIORITY:: "+thread2.getPriority());
        System.out.println("COUNT::"+Thread.activeCount());
    }
}
