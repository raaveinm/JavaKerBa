package PatternAbstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        GUIFactory winFactory = new WinGUIFactory();
        Button winButton = winFactory.createButton();
        Checkbox winCheckbox = winFactory.createCheckbox();
        winButton.draw();
        winCheckbox.draw();

        GUIFactory macFactory = new MacGUIFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();
        macButton.draw();
        macCheckbox.draw();
    }
}
