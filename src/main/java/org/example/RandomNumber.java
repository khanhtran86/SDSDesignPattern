package org.example;

import java.util.Queue;
import java.util.Random;

public class RandomNumber implements Runnable {
    private Queue<Integer> numbersStore;

    public RandomNumber(Queue<Integer> numbersStore) {
        this.numbersStore = numbersStore;
    }

    @Override
    public void run() {
        while (numbersStore.size() < 1000) {
            Random random = new Random();
            int number = random.nextInt(1000);
            numbersStore.add(number);

            System.out.println("Added number: " + number +" by "+ Thread.currentThread().getName());
        }
    }
}
