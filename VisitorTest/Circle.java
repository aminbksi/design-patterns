public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateAreaWith(AreaCalculator calculator) {
         System.out.println(calculator.calculateCircleArea(this));
    }

    public double getRadius() {
        return radius;
    }
}
