package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000); //Ngung method main torng 1s

        //Tao thread bang cach new class thread vua tao.
        Thread thread = new ThreadExtends();
        thread.setName("Thread-1");

        Thread thread2 = new Thread(new ThreadRunable(thread));
        thread2.setName("Thread-2");

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println("Main thread stopped!");
    }
}
