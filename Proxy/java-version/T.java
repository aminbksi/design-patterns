public class T {
    private String text;

    public T(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return Dictionary.dictionary.get(text).getOrDefault(Settings.language, text);
    }
}
