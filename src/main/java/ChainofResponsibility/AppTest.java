package ChainofResponsibility;

public class AppTest {
    public static void main(String[] args) {
        Logger logger = new DBLogger();
        Logger FileLogger = new FileLogger();
        Logger ConsoleLogger = new ConsoleLogger();

        logger.nextLogger = FileLogger;
        FileLogger.nextLogger = ConsoleLogger;

        logger.logMessage("This is log message");
        logger.logMessage("This is log message 2");
        logger.logMessage("This is log message 3");
        logger.logMessage("This is log message 4");
        logger.logMessage("This is log message 5");
    }
}
