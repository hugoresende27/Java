package broTutorials;
/*
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum
utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //criar um thread
        MyThread thread1 = new MyThread();

        //outro metodo para criar uma thread
        //inciar a classe MyRunnable
        MyRunnable runnable1 = new MyRunnable();
        //atribuir o objeto criado da classe a uma nova Thread
        Thread thread2 = new Thread(runnable1);

        //executam as 2 em simultâneo//thread1 tem uma exeption
        thread1.start();
        thread2.start();
        //thread2.join() vai fazer com que a proxima thread só seja executada quando a anterior acabar
        thread2.join();


        MyRunnable run3 = new MyRunnable();
        Thread thread3 = new Thread(run3);
        thread3.start();

        //deamon thread
        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread3.setDaemon(true);




    }
}
