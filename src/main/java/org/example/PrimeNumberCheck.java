package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class PrimeNumberCheck implements Runnable {
    private Queue<Integer> numbersStore;

    public PrimeNumberCheck(Queue<Integer> numbersStore) {
        this.numbersStore = numbersStore;
    }

    @Override
    public void run() {
        while (!numbersStore.isEmpty()) {
            Integer number = getNumberFromQueue();
            if(number !=null) {
                if (this.isPrimeNumber(number)) {
                    System.out.println("Found prime number: " + number + " from Thread: " + Thread.currentThread().getName());
                }
            }
        }
    }

    private Integer getNumberFromQueue() {
        Integer number = numbersStore.poll();
        System.out.println(number + " - Data Store Remaning: " + numbersStore.size());
        return number;
    }

    boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }
}
