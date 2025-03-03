package Strategy;

public class ShippingContext {
    private ShippingStrategy strategy;
    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShippingCost(double weight) {
        if(strategy==null)
        {
            throw new RuntimeException("No Strategy set");
            //Default
            //strategy = new RoadShipping();
            //strategy.calculateCost(weight);
        }
        else {
            return strategy.calculateCost(weight);
        }
    }
}
