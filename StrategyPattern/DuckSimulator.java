import duck.Duck;
import duck.RubberDuck;
import fly.FlyWithWings;

/**
 * just design a system for duck simulator, where can we observe different types of ducks
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehaviour(new FlyWithWings());
        duck.performFly();
    }
}
