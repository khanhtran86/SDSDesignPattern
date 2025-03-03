package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class DemoRandomNumber {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> numbersStore = new LinkedList<Integer>();
        int threadCount = 2;

        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new RandomNumber(numbersStore));
            thread.setName("Thread " + i);

            thread.start();

            //thread.join();
        }

        /*
        for (int i = 0; i < numbersStore.size(); i++) {
            System.out.println(numbersStore.poll());
        }
        */
    }
}
