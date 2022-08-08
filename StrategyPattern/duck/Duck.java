package duck;

import fly.FlyBehaviour;
import quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void display() {
        System.out.println("I'm a duck");
    }

    public void performFly() {
        flyBehaviour.performFly();
    }

    public void performQuack() {
        quackBehaviour.performQuack();
    }
}
