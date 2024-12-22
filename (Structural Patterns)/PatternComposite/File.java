package PatternComposite;

public class File implements FileComponent{
    private String FileName;

    public File(String FileName){
        this.FileName = FileName;
    }
    public void display(){
        System.out.println(FileName);
    }
}