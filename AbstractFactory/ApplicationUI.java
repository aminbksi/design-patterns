public class ApplicationUI {
    private final AbstractFactory factory;

    public ApplicationUI(AbstractFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        Window window = factory.createWindow();
        Button button = factory.createButton();
        window.draw();
        button.draw();
    }
}
