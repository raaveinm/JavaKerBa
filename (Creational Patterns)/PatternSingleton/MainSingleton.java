package PatternSingleton;

public class MainSingleton {
    public static void main(String[] args) {
        SettingsThread thread1 = new SettingsThread("theme", "dark");
        SettingsThread thread2 = new SettingsThread("language", "ru");
        SettingsThread thread3 = new SettingsThread("filePath", "/new/path/to/files");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}