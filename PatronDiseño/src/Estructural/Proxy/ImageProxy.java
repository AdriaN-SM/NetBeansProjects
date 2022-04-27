package Estructural.Proxy;

/* 
    Proxy

   https://en.wikipedia.org/wiki/Proxy_pattern
   https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
   https://www.oodesign.com/proxy-pattern.html
 */
public class ImageProxy implements Image {

    private Image proxifiedImage;
    private String imageFilePath;

    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void showImage() {
        // create the Image Object only when the image is required to be shown
        if (proxifiedImage == null) {
            proxifiedImage = new HighResolutionImage(imageFilePath);
        }
        // now call showImage on realSubject
        proxifiedImage.showImage();
    }

}
