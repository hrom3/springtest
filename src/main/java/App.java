import beans.Client;
import loggers.ConsoleEventLogger;
import loggers.IEventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
   private Client client;
    private IEventLogger eventLogger;

    public App(Client client, IEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(String str) {
        String msg = str.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(msg);
    }



    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) ctx.getBean("app");

        app.logEvent("Some even for user 1");
        app.logEvent("Some even for user 2");

    }
}