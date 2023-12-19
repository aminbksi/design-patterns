import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static Map<String, Map<String, String>> dictionary = new HashMap<>();

    static {
        Map<String, String> postTranslations = new HashMap<>();
        postTranslations.put("fa", "پست");

        Map<String, String> draftTranslations = new HashMap<>();
        draftTranslations.put("fa", "پیش‌نویس");

        dictionary.put("Post", postTranslations);
        dictionary.put("Draft", draftTranslations);
    }
}
