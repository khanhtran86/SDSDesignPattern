package state;

public class NoCoinState implements State {
    @Override
    public void insertCoin(VenderMachine machine) {
        System.out.println("Coin Inserted. You can press the button new.");
        //Change to has coin state
        machine.setState(new HasCoinState());
    }

    @Override
    public void pressButton(VenderMachine machine) {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void despense(VenderMachine machine) {
        System.out.println("Please insert a coin first.");
    }
}
