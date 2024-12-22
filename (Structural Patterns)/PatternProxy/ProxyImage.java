package PatternProxy;

public class ProxyImage implements ImageProxyInterface {
    private FImage image;
    private static String fImage;

    public ProxyImage(String fImage){
        ProxyImage.fImage = fImage;
    }

    public void display() {
        if (image == null) {
            image = new FImage(fImage);
        }
        else{
            image.OpenImage();
        }
    }
}