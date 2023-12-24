import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, Object> settings;

    private ConfigurationManager() {
        settings = new HashMap<>();
        loadSettings();
    }

    private void loadSettings() {
        settings.put("key1", "value1");
        settings.put("key2", "value2");
        settings.put("key3", "value3");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public Object getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, Object value) {
        settings.put(key, value);
    }
}
