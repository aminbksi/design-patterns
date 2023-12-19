public class AddTextCommand implements Command {
    private final TextEditor editor;
    private final String newText;

    public AddTextCommand(TextEditor editor, String newText) {
        this.editor = editor;
        this.newText = newText;
    }

    @Override
    public void execute() {
        editor.addText(newText);
    }
}