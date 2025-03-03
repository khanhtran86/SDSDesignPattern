package state;

public class DemoState {
    public static void main(String[] args) {
        VenderMachine vm = new VenderMachine();
        vm.pressButton();
        vm.insertCoin(); //No coin
        vm.insertCoin(); //Has coin

        vm.pressButton();
        vm.despense();

        vm.insertCoin();
    }
}
