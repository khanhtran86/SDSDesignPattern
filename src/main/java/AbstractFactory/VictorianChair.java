package AbstractFactory;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an Victorian Chair");
    }
}
