package PatternSingleton;

import java.util.HashMap;
import java.util.Map;

public class AppSettings {

    private static AppSettings instance;
    private Map<String, String> settings;

    private AppSettings() {
        settings = new HashMap<>();
        settings.put("theme", "light");
        settings.put("language", "en");
        settings.put("filePath", "/path/to/files");
    }

    public static synchronized AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }
}