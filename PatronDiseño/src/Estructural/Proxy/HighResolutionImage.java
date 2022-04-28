package Estructural.Proxy;

/**
 * RealSubject
 */
public class HighResolutionImage implements Image {

    private String imageFilePath;

    public HighResolutionImage(String imageFilePath) {
        this.imageFilePath = imageFilePath;
        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {

        // load Image from disk into memory
        // this is heavy and costly operation
        System.out.println("Displaying " + imageFilePath);
    }

    @Override
    public void showImage() {

        // Actual Image rendering logic
        System.out.println("Displaying " + imageFilePath);

    }

}
