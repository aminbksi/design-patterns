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

public interface UIComponentFactory {
    UIComponent createUIComponent();
}

public class RoundedButtonFactory implements UIComponentFactory {
    public UIComponent createUIComponent() {
        return Button.createButton("rounded");
    }
}

public class SquareButtonFactory implements UIComponentFactory {
    public UIComponent createUIComponent() {
        return Button.createButton("square");
    }
}

public class Main {
    public static void main(String[] args) {
        UIComponentFactory factory = new RoundedButtonFactory();
        UIComponent button = factory.createUIComponent();
        button.display();
    }
}
