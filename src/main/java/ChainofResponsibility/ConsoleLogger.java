package ChainofResponsibility;

public class ConsoleLogger extends Logger {
    @Override
    protected void write(String message) {
        System.out.println("Console Log: " + message);
    }
}
