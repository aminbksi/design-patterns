import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager _instance;
    private Map<String, Object> _settings;

    private ConfigurationManager() {
        if (_instance == null) {
            _instance = this;
            _settings = new HashMap<>();
            loadSettings();
        }
    }

    private void loadSettings() {
        // Implementation for loading settings goes here
    }

    public static ConfigurationManager getInstance() {
        if (_instance == null) {
            new ConfigurationManager();
        }
        return _instance;
    }

    public Object getSetting(String key) {
        return _settings.get(key);
    }

    public void setSetting(String key, Object value) {
        _settings.put(key, value);
    }
}
