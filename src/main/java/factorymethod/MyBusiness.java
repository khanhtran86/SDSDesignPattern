package factorymethod;

public class MyBusiness {
    public static void main(String[] args) {
        BaseLogistic myLogistic;
        myLogistic = LogisticManager.getLogistic("air");

        myLogistic.planDelivery();
    }
}
