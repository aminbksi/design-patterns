// Tree class
public class Tree {
    private TreeType treeType;
    private int[] position;
    private int rotation;

    public Tree(TreeType treeType, int[] position, int rotation) {
        this.treeType = treeType;
        this.position = position;
        this.rotation = rotation;
    }

    public void render() {
        treeType.render(position, rotation);
    }
}
