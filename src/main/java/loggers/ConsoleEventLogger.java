package loggers;

public class ConsoleEventLogger implements IEventLogger {
    public void logEvent(String msg) {
        System.out.println(msg);
    }
}
