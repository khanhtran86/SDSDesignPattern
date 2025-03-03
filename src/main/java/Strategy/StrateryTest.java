package Strategy;

public class StrateryTest {
    public static void main(String[] args) {
        ShippingContext context = new ShippingContext();
        double weight = 10;

        context.setStrategy(new SeaShipping());
        double cost = context.calculateShippingCost(weight);
        System.out.println(cost);
    }
}
