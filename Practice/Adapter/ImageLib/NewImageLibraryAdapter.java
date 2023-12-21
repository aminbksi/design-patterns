
public class NewImageLibraryAdapter implements ImageLibraryAdapter {
    private NewImageLibrary newImageLibrary;

    public NewImageLibraryAdapter(NewImageLibrary newImageLibrary) {
        this.newImageLibrary = newImageLibrary;
    }

    @Override
    public void displayImage(String image) {
        newImageLibrary.render(image);
    }
}