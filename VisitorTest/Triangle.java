public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateAreaWith(AreaCalculator calculator) {
        System.out.println(calculator.calculateTriangleArea(this));
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
