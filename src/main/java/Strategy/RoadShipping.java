package Strategy;

public class RoadShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight*1.2;
    }
}
