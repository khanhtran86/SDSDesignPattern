package ChainofResponsibility;

public class DBLogger extends Logger {
    @Override
    protected void write(String message) {
        System.out.println("Write to DB: " + message);
    }
}
