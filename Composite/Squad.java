import java.util.ArrayList;
import java.util.List;

// Squad class implementing GameUnit interface
public class Squad implements GameUnit {
    private List<GameUnit> units;

    public Squad() {
        this.units = new ArrayList<>();
    }

    public void add(GameUnit unit) {
        units.add(unit);
    }

    @Override
    public void render() {
        for (GameUnit unit : units) {
            unit.render();
        }
    }

    @Override
    public void move() {
        for (GameUnit unit : units) {
            unit.move();
        }
    }

    @Override
    public void attack() {
        for (GameUnit unit : units) {
            unit.attack();
        }
    }
}
