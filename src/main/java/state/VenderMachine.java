package state;

public class VenderMachine {
    private State state;

    public VenderMachine() {
        this.state = new NoCoinState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void pressButton(){
        state.pressButton(this);
    }

    public void despense() {
        state.despense(this);
    }
}
