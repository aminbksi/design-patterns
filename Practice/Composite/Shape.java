

public interface Shape {
    void draw();
}

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class CompositeShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        this.shapes.remove(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : this.shapes) {
            shape.draw();
        }
    }
} 

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        CompositeShape compositeShape = new CompositeShape();
        compositeShape.addShape(rectangle);
        compositeShape.addShape(circle);
        compositeShape.addShape(triangle);

        compositeShape.draw();
    }
}