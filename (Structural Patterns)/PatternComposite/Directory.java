package PatternComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent{
    private String FolderName;
    private List<FileComponent> components = new ArrayList<>();

    public Directory(String FolderName){
        this.FolderName = FolderName;
    }
    public void display(){
        System.out.println("Directory: "+FolderName);
        for (FileComponent component : components) {
            component.display();
        }
    }

    public void AddItem(FileComponent component) {
        components.add(component);
    }

    public void DeleteItem(FileComponent component){
        components.remove(component);
    }

    public FileComponent getChild(int index){
        return components.get(index);
    }
}
