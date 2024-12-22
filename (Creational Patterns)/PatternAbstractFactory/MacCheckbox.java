package PatternAbstractFactory;

public class MacCheckbox implements Checkbox {

    @Override
    public void draw() {
        System.out.println("macOS Checkbox");
    }
}