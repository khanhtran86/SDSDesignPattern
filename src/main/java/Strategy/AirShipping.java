package Strategy;

public class AirShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight*2.5;
    }
}
