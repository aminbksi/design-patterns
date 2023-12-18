public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        config1.setSetting("db_host", "localhost");

        System.out.println(config1.getSetting("db_host"));  // Output: localhost

        ConfigurationManager config2 = ConfigurationManager.getInstance();
        System.out.println(config2.getSetting("db_host"));  // Output: localhost

        System.out.println(config1 == config2);  // Output: true
    }
}
