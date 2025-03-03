package AbstractFactory;

public class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an Art Deco Chair");
    }
}
