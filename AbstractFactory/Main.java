import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String platformName = System.getProperty("os.name", "unknown").toLowerCase(Locale.ROOT);
        AbstractFactory factory;

        if (platformName.contains("linux")) {
            factory = new LinuxFactory();
        } else if (platformName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        ApplicationUI application = new ApplicationUI(factory);
        application.createUI();
    }
}
