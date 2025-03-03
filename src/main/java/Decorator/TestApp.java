package Decorator;

public class TestApp {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        //Show info
        System.out.println(coffee.getDescription() + " | Gia: " + coffee.getPrice());

        //Cafe duong
        Coffee sugarCoffee = new SugarDecorator(coffee);
        System.out.println(sugarCoffee.getDescription() + " | Gia: " + sugarCoffee.getPrice());

        //Cafe sua
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " | Gia: " + milkCoffee.getPrice());
    }
}
