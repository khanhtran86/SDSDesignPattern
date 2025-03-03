package Decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee originalCoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.originalCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return originalCoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return originalCoffee.getPrice()   ;
    }
}
