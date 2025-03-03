package Decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee nguyen chat";
    }

    @Override
    public double getPrice() {
        return 20d;
    }
}
