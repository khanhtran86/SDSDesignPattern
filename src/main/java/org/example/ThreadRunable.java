package org.example;

public class ThreadRunable implements Runnable {
    private Thread dependThread;
    public ThreadRunable(Thread t) {
        this.dependThread =t;
    }
    @Override
    public void run() {
        try {
            this.dependThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
