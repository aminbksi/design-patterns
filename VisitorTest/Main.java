public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 6);

        AreaCalculator calculator = new AreaCalculatorMain();

        circle.calculateAreaWith(calculator);
        rectangle.calculateAreaWith(calculator);
        triangle.calculateAreaWith(calculator);
    }
}
