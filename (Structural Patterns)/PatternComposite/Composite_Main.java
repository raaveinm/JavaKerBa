package PatternComposite;

public class Composite_Main {
    public static void main(String[] args){

        Directory raaveinm = new Directory("raaveinm");
        raaveinm.AddItem(new File(".gitignore"));

        Directory kraken = new Directory("kraken");
        kraken.AddItem(new Directory("SubKraken"));
        kraken.AddItem(new File(".gitignore"));

        raaveinm.AddItem(kraken);
        raaveinm.display();

        System.out.println();
        raaveinm.DeleteItem(kraken);
        raaveinm.display();
    }
}
