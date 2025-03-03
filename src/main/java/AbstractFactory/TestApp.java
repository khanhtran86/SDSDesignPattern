package AbstractFactory;

public class TestApp {
    public static void main(String[] args) {
        FunitureFactory factory;
        factory = new VictorianFurnitureFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.sitOn();
        sofa.lieOn();
        coffeeTable.placeItems();
    }
}
