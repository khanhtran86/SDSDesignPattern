package AbstractFactory;

public class VictorianCoffeeTable implements CoffeeTable{
    @Override
    public void placeItems() {
        System.out.println("Placing items in Victorian table");
    }
}
