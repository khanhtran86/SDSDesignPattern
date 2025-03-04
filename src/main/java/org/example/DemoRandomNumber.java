package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoRandomNumber {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> numbersStore = new LinkedList<Integer>();
        int threadCount = 2;
        List<Thread> threads = new ArrayList<Thread>();
        List<Thread> primeThreads = new ArrayList<Thread>();
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new RandomNumber(numbersStore));
            thread.setName("Thread " + i);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Da hoan thanh sinh 1000 so ngau nhien!");

        //Filter Prime Number
        for (int i = 0; i < threadCount; i++) {
            Thread primeNumberThreads = new Thread(new PrimeNumberCheck(numbersStore));
            primeNumberThreads.setName("Prime Number Finder "+ i);
            primeThreads.add(primeNumberThreads);
            primeNumberThreads.start();
        }


        for (Thread thread : primeThreads) {
            thread.join();
        }

        System.out.println("Xong!");
    }
}
