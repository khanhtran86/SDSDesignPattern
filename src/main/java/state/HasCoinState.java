package state;

public class HasCoinState implements State {
    @Override
    public void insertCoin(VenderMachine machine) {
        System.out.println("Coin already inserted. You can press the button to get your product.");
    }

    @Override
    public void pressButton(VenderMachine machine) {
        System.out.println("Button pressed. Depending product...");
        machine.setState(new DispensingState());
    }

    @Override
    public void despense(VenderMachine machine) {
        System.out.println("Press the button to dispens the product.");
    }
}
