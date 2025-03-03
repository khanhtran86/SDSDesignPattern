package ChainofResponsibility;

public abstract class Logger {
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(String message) {
        if(canHanlde==true) {
            canHanlde=false;
            write(message);
        }
        else {
            if (nextLogger != null) {
                nextLogger.logMessage(message);
            }
        }
    }

    protected boolean canHanlde=true;
    protected abstract void write(String message);
}
