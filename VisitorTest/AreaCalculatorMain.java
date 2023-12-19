public class AreaCalculatorMain implements AreaCalculator {
    @Override
    public double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    @Override
    public double calculateTriangleArea(Triangle triangle) {
        return 0.5 * triangle.getBase() * triangle.getHeight();
    }
}
