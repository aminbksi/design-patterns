public class Product {
    private String name;
    private double weight;
    private double distance;

    public Product(String name, double weight, double distance) {
        this.name = name;
        this.weight = weight;
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }
}
