public class LinuxFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
