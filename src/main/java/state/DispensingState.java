package state;

public class DispensingState implements State {
    @Override
    public void insertCoin(VenderMachine machine) {
        System.out.println("Please wait, dispensing product...");
    }

    @Override
    public void pressButton(VenderMachine machine) {
        System.out.println("Already dispensing. Please wait...");
    }

    @Override
    public void despense(VenderMachine machine) {
        System.out.println("Product Dispensed. Return to initial state.");
        machine.setState(new NoCoinState());
    }
}
