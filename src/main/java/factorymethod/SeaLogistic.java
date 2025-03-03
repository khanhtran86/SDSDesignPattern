package factorymethod;

public class SeaLogistic implements BaseLogistic {
    @Override
    public void planDelivery() {
        System.out.println("Delivery by Sea Logistic");
    }
}
