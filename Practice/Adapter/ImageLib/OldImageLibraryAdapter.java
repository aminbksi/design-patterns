
public class OldImageLibraryAdapter implements ImageLibraryAdapter {
    private OldImageLibrary oldImageLibrary;

    public OldImageLibraryAdapter(OldImageLibrary oldImageLibrary) {
        this.oldImageLibrary = oldImageLibrary;
    }

    @Override
    public void displayImage(String image) {
        oldImageLibrary.renderImage(image);
    }
}