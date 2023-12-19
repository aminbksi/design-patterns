// TreeType class
public class TreeType {
    private String texture;
    private String mesh;
    private String color;

    public TreeType(String texture, String mesh, String color) {
        this.texture = texture;
        this.mesh = mesh;
        this.color = color;
    }

    public void render(int[] position, int rotation) {
        System.out.println("Rendering tree of type " + texture +
                " at position " + position[0] + ", " + position[1] +
                " with rotation " + rotation);
    }
}
