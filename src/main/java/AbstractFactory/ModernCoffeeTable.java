package AbstractFactory;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void placeItems() {
        System.out.println("Placing items in Modern table");
    }
}
