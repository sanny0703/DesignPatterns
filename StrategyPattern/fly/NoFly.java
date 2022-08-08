package fly;

public class NoFly implements FlyBehaviour{
    @Override
    public void performFly() {
        System.out.println("I can't fly");
    }
}
