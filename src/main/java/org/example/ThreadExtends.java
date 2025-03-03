package org.example;

//Tao thread bang cach extend mot subclass tu class Thread
public class ThreadExtends extends Thread {
    @Override
    //Entry point cua thread - Khi thread start thi se chay vao ham nay.
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
