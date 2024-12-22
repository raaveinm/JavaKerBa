package PatternProxy;

public class FImage {
    private static String FilePath;

    public FImage(String FilePath){
        FImage.FilePath = FilePath;
        ImageCreate();
    }

    public void ImageCreate(){
        System.out.println("Image Created. Image path: "+FilePath);
    }

    public void OpenImage(){
        System.out.println("Image "+FilePath+" opened");
    }
}
