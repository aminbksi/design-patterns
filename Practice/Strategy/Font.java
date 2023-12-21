
public interface FormatStrategy {
    public void type(String text);
}

public class NormalStrategy implements FormatStrategy {
    @Override
    public void type(String text) {
        System.out.println(text);
    }
}

public class ItalicStrategy implements FormatStrategy {
    @Override
    public void type(String text) {
        System.out.println("<i>" + text + "</i>");
    }
}

public class BoldStrategy implements FormatStrategy {
    @Override
    public void type(String text) {
        System.out.println("<b>" + text + "</b>");
    }
}

public class Pen {
    private FormatStrategy formatStrategy;

    public Pen() {
        this.formatStrategy = new NormalStrategy();
    }

    public void setFormatStrategy(FormatStrategy formatStrategy) {
        this.formatStrategy = formatStrategy;
    }

    public void write(String text) {
        this.formatStrategy.type(text);
    }
}

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.write("Hello World!");  // Output: Hello World!

        pen.setFormatStrategy(new ItalicStrategy());
        pen.write("Hello World!");  // Output: <i>Hello World!</i>

        pen.setFormatStrategy(new BoldStrategy());
        pen.write("Hello World!");  // Output: <b>Hello World!</b>
    }
}