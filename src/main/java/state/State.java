package state;

public interface State {
    void insertCoin(VenderMachine machine);
    void pressButton(VenderMachine machine);
    void despense(VenderMachine machine);
}
