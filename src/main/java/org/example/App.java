package org.example;

public class App {
    Client client;
    ConsoleEventLogger consoleEventLogger;

    public void logEvent(String str) {
        String msg = str.replaceAll(client.getId(), client.getFullName());
        consoleEventLogger.logEvent(msg);
    }



    public static void main(String[] args) {
        App app = new App();

        app.client = new Client("1", "John Smith");
        app.consoleEventLogger = new ConsoleEventLogger();

        app.logEvent("Some even for user 1");
    }
}