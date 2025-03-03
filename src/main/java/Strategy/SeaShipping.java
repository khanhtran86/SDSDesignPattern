package Strategy;

public class SeaShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight*0.8;
    }
}
