import java.util.HashMap;
import java.util.Map;

// TreeFactory class
public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String texture, String mesh, String color) {
        String treeKey = texture + mesh + color;
        if (!treeTypes.containsKey(treeKey)) {
            treeTypes.put(treeKey, new TreeType(texture, mesh, color));
        }
        return treeTypes.get(treeKey);
    }
}
