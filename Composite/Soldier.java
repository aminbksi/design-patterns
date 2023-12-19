// Soldier class implementing GameUnit interface
public class Soldier implements GameUnit {
    @Override
    public void render() {
        System.out.println("Rendering Soldier");
    }

    @Override
    public void move() {
        System.out.println("Moving Soldier");
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Soldier");
    }
}
