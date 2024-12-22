package PatternSingleton;

public class SettingsThread extends Thread {

    private final String key;
    private final String value;

    public SettingsThread(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public void run() {
        AppSettings settings = AppSettings.getInstance();
        settings.setSetting(key, value);
        System.out.println(Thread.currentThread().getName() + " set value " + value + " for key " + key);
        System.out.println(Thread.currentThread().getName() + " get value " + settings.getSetting(key) + " for key " + key);
    }
}