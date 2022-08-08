package duck;

import fly.NoFly;
import quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new NoFly();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
