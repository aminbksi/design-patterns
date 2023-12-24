public interface Language {
    void display();
}

public class English implements Language {
    @Override
    public void display() {
        System.out.println("This is English");
    }
}

public class Dutch implements Language {
    @Override
    public void display() {
        System.out.println("Dit is Nederlands");
    }
}

public class LanguageProxy implements Language {
    private Language language;
    private String languageName;

    public LanguageProxy(String languageName) {
        this.languageName = languageName;
    }

    @Override
    public void display() {
        if (language == null) {
            language = createLanguage(languageName);
        }
        language.display();
    }

    private Language createLanguage(String languageName) {
        switch (languageName.toLowerCase()) {
            case "english":
                return new English();
            case "dutch":
                return new Dutch();
            default:
                throw new IllegalArgumentException("Unsupported language: " + languageName);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        LanguageProxy languageProxy = new LanguageProxy("english");

        languageProxy.display();

        languageProxy = new LanguageProxy("dutch");
        languageProxy.display();

        languageProxy = new LanguageProxy("english");
        languageProxy.display();
    }
}
