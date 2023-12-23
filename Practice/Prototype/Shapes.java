
interface Prototype {
    Prototype clone();
    void customize(int x, int y, String color, int... additionalParameters);
}


public abstract class BaseShape implements Prototype {
    protected int x;
    protected int y;
    protected String color;

    @Override
    public abstract Prototype clone();

    @Override
    public abstract void customize(int x, int y, String color, int... additionalParameters);

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}

class BaseCircle extends BaseShape {
    private int radius;

    public BaseCircle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new BaseCircle(this.x, this.y, this.radius, this.color);
    }

    @Override
    public void customize(int x, int y, String color, int... additionalParameters) {
        this.x = x;
        this.y = y;
        this.color = color;
        if (additionalParameters.length > 0) {
            this.radius = additionalParameters[0];
        }
    }

    public int getRadius() {
        return radius;
    }
}

class BaseRectangle extends BaseShape {
    private int width;
    private int height;

    public BaseRectangle(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new BaseRectangle(this.x, this.y, this.width, this.height, this.color);
    }

    @Override
    public void customize(int x, int y, String color, int... additionalParameters) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}

class BaseSquare extends BaseShape {
    private int side;

    public BaseSquare(int x, int y, int side, String color) {
        this.x = x;
        this.y = y;
        this.side = side;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new BaseSquare(this.x, this.y, this.side, this.color);
    }

    @Override
    public void customize(int x, int y, String color, int... additionalParameters) {
        this.x = x;
        this.y = y;
        this.color = color;
        if (additionalParameters.length > 0) {
            this.side = additionalParameters[0];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BaseCircle circle = new BaseCircle(0, 0, 10, "red");
        BaseRectangle rectangle = new BaseRectangle(0, 0, 20, 30, "blue");
        BaseSquare square = new BaseSquare(0, 0, 15, "green");

        Prototype clonedCircle = circle.clone();
        clonedCircle.customize(5, 5, "yellow", 15);
        System.out.println(clonedCircle);

        Prototype clonedRectangle = rectangle.clone();
        clonedRectangle.customize(10, 10, "orange");
        System.out.println(clonedRectangle);

        Prototype clonedSquare = square.clone();
        clonedSquare.customize(7, 7, "purple", 12);
        System.out.println(clonedSquare);
    }
}
