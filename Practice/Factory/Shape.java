package Practice.Factory;

public interface Shape {
    void draw();
}

public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public interface ShapeFactory {
    Shape createShape();
}

public class CircleFactory implements ShapeFactory {
    public Shape createShape() {
        return new Circle();
    }
}

public class SquareFactory implements ShapeFactory {
    public Shape createShape() {
        return new Square();
    }
}

public class TriangleFactory implements ShapeFactory {
    public Shape createShape() {
        return new Triangle();
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory();
        Shape shape = factory.createShape();
        shape.draw();
    }
}