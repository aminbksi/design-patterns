// TextEditor class
public class TextEditor {
    private StringBuilder content;

    public TextEditor() {
        this.content = new StringBuilder();
    }

    public void addText(String text) {
        this.content.append(text);
    }

    public void toUpper() {
        this.content = new StringBuilder(this.content.toString().toUpperCase());
    }

    public String getContent() {
        return this.content.toString();
    }
}
