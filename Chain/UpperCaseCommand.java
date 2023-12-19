public class UpperCaseCommand implements Command {
    private final TextEditor editor;

    public UpperCaseCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.toUpper();
    }
}