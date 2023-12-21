
public class Main {
    public static void main(String[] args) {
        String image_file = "test.png";

        NewImageLibrary new_image_library = new NewImageLibrary();
        NewImageLibraryAdapter new_image_library_adapter = new NewImageLibraryAdapter(new_image_library);

        new_image_library_adapter.displayImage(image_file);

    }
}