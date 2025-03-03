package singleton;

import java.util.Random;

public class SingleSample {
    /* Not follow single ton*/
    /*
    private int luckyNumber;

    public SingleSample(){
        Random rand = new Random();
        this.luckyNumber = rand.nextInt(100);
    }

    public void sayHello(){
        System.out.println("Hello. Your lucky number is " + this.luckyNumber);
    }
     */

    /*Follow singleton*/
    private int luckyNumber;
    private static SingleSample instance;

    private SingleSample(){
        Random rand = new Random();
        this.luckyNumber = rand.nextInt(100);
    }

    public static SingleSample getInstance(){
        if(instance == null){
            instance = new SingleSample();
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("Hello. Your lucky number is " + this.luckyNumber);
    }
}
