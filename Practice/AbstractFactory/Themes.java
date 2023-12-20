public interface UIComponent {
    void display();
}

public class Button implements UIComponent {
    private String type;

    private Button(String type) {
        this.type = type;
    }

    public static Button createButton(String type) {
        return new Button(type);
    }

    public void display() {
        System.out.println("Displaying a button");
    }
}

public class TextField implements UIComponent {
    private String type;

    private TextField(String type) {
        this.type = type;
    }

    public static TextField createTextField(String type) {
        return new TextField(type);
    }

    public void display() {
        System.out.println("Displaying a text field");
    }
}

public class Background implements UIComponent {
    private String type;

    private Background(String type) {
        this.type = type;
    }

    public static Background createBackground(String type) {
        return new Background(type);
    }

    public void display() {
        System.out.println("Displaying a background");
    }
}

public interface LightThemeFactory {
    Button createButton();
    TextField createTextField();
    Background createBackground();
}

public interface DarkThemeFactory {
    Button createButton();
    TextField createTextField();
    Background createBackground();
}

public class LightThemeRoundedFactory implements LightThemeFactory {
    public Button createButton() {
        return Button.createButton("rounded");
    }

    public TextField createTextField() {
        return TextField.createTextField("rounded");
    }

    public Background createBackground() {
        return Background.createBackground("rounded");
    }
}

public class LightThemeSquareFactory implements LightThemeFactory {
    public Button createButton() {
        return Button.createButton("square");
    }

    public TextField createTextField() {
        return TextField.createTextField("square");
    }

    public Background createBackground() {
        return Background.createBackground("square");
    }
}

public class DarkThemeRoundedFactory implements DarkThemeFactory {
    public Button createButton() {
        return Button.createButton("rounded");
    }

    public TextField createTextField() {
        return TextField.createTextField("rounded");
    }

    public Background createBackground() {
        return Background.createBackground("rounded");
    }
}

public class DarkThemeSquareFactory implements DarkThemeFactory {
    public Button createButton() {
        return Button.createButton("square");
    }

    public TextField createTextField() {
        return TextField.createTextField("square");
    }

    public Background createBackground() {
        return Background.createBackground("square");
    }
}

public class Main {
    public static void main(String[] args) {
        LightThemeFactory factory = new LightThemeRoundedFactory();
        Button button = factory.createButton();
        button.display();
    }
}
