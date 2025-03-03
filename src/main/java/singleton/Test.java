package singleton;

public class Test {
    public static void main(String[] args) {
        SingleSample sample = SingleSample.getInstance();
        sample.sayHello();

        SingleSample sample2 = SingleSample.getInstance();
        sample2.sayHello();
    }
}
