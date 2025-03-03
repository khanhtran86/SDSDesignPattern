package AbstractFactory;

public class ArtDecoCoffeeTable implements CoffeeTable{
    @Override
    public void placeItems() {
        System.out.println("Placing items in Art Deco coffee table");
    }
}
