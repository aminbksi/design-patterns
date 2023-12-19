import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();

        // Create a shared tree type using the factory
        TreeType oakType = TreeFactory.getTreeType("OakTexture", "OakMesh", "Green");

        // Populate the forest using the shared tree type but unique position and rotation
        for (int i = 0; i < 100000; i++) {
            Tree tree = new Tree(oakType, new int[]{i, i + 1}, i * 5);
            forest.add(tree);
        }

        // For demonstration, render the first 5 trees
        for (Tree tree : forest.subList(0, 5)) {
            tree.render();
        }
    }
}
