
public interface NavigationStrategy {
    public void navigate();
}

public class LandNavigationStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Land navigation strategy");
    }
}

public class AirNavigationStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Air navigation strategy");
    }
}

public class WaterNavigationStrategy implements NavigationStrategy {
    @Override
    public void navigate() {
        System.out.println("Water navigation strategy");
    }
}

public class Robot {
    private NavigationStrategy navigationStrategy;

    public Robot() {
        this.navigationStrategy = new LandNavigationStrategy();
    }

    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void move() {
        this.navigationStrategy.navigate();
    }
}

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.move();  // Output: Land navigation strategy

        robot.setNavigationStrategy(new AirNavigationStrategy());
        robot.move();  // Output: Air navigation strategy

        robot.setNavigationStrategy(new WaterNavigationStrategy());
        robot.move();  // Output: Water navigation strategy
    }
}