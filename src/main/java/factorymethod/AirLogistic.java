package factorymethod;

public class AirLogistic implements BaseLogistic{
    @Override
    public void planDelivery() {
        System.out.println("AirLogistic PlanDelivery");
    }
}
