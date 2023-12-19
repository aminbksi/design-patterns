import java.util.ArrayList;
import java.util.List;

public class Twitter {
    public void input() {
        List<Button> buttons = new ArrayList<>();
        buttons.add(new Button(new T("Post").toString()));
        buttons.add(new Button(new T("Draft").toString()));
        showButtons(buttons);
    }

    private void showButtons(List<Button> buttons) {
        for (Button b : buttons) {
            b.show();
        }
    }
}
